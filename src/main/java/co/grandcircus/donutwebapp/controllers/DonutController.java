package co.grandcircus.donutwebapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.grandcircus.donutwebapp.service.DonutService;

@Controller
public class DonutController {

	@Autowired
	private DonutService apiService;
	
	@RequestMapping("/")
	public String donutHome(Model model) {
		model.addAttribute("donutList", apiService.getDonuts());
		return "home";
	}
	
	@RequestMapping("/donut-details")
	public String donutDetails(Model model,
							   @RequestParam Integer id) {
		model.addAttribute("donut", apiService.findDonutById(id));
		
		return "details";
		
	}
}
	