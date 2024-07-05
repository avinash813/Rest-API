package com.sample.pojo;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

//@JsonIgnoreProperties(ignoreUnknown=true)
//@JacksonXmlRootElement(localName = "Implementer")
public class Implementer 
{
//   @JacksonXmlProperty
   private Integer id;
   
//   @JacksonXmlProperty
   private String name;
   
//   @JacksonXmlProperty
   private String city;
   
//   @JacksonXmlProperty
   private String[] teamNames;
   
//   @JacksonXmlProperty
   private List<String> studies;
   
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String[] getTeamNames() {
	return teamNames;
}
public void setTeamNames(String[] teamNames) {
	this.teamNames = teamNames;
}
public List<String> getStudies() {
	return studies;
}
public void setStudies(List<String> studies) {
	this.studies = studies;
}
@Override
public String toString() {
	return "Implementer [id=" + id + ", name=" + name + ", city=" + city + ", teamNames=" + Arrays.toString(teamNames)
			+ ", studies=" + studies + "]";
}

   
   
}
