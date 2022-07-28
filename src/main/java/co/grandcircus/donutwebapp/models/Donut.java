package co.grandcircus.donutwebapp.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Donut {
	
private Integer id;
private String ref;
private String name;
private Integer calories;
private List<String> extras;
private String photo;
@JsonProperty("photo_attribution")
private String photoAttribution;

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getRef() {
	return ref;
}
public void setRef(String ref) {
	this.ref = ref;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getCalories() {
	return calories;
}
public void setCalories(Integer calories) {
	this.calories = calories;
}
public List<String> getExtras() {
	return extras;
}
public void setExtras(List<String> extras) {
	this.extras = extras;
}
public String getPhoto() {
	return photo;
}
public void setPhoto(String photo) {
	this.photo = photo;
}
public String getPhotoAttribution() {
	return photoAttribution;
}
public void setPhotoAttribution(String photoAttribution) {
	this.photoAttribution = photoAttribution;
}
	

	

}
