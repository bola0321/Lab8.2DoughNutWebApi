package co.grandcircus.donutwebapp.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.donutwebapp.models.Donut;
import co.grandcircus.donutwebapp.models.DonutResults;

@Service
public class DonutService {
	private RestTemplate restTemplate = new RestTemplate();
	
	public List<Donut> getDonuts(){
		String url = "https://grandcircusco.github.io/demo-apis/donuts.json";
		
		return restTemplate.getForObject(url, DonutResults.class).getResults();
		
	}
	
	public Donut findDonutById(Integer id) {
		String url = "https://grandcircusco.github.io/demo-apis/donuts/{id}.json";
		return restTemplate.getForObject(url, Donut.class,id);
	}
}
