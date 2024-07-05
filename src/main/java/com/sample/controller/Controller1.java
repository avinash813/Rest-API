package com.sample.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.pojo.Implementer;


@RestController
@RequestMapping("/api/implementers")
public class Controller1
{
	
		
	  @GetMapping("/report")
      public ResponseEntity<Implementer> showImplementers()
      {
    	  Implementer impl=new Implementer();
    	  impl.setId(101);
    	  impl.setName("Rohan");
    	  impl.setCity("Pune");
    	  impl.setTeamNames(new String[] {"achievers","dreamers","invincibles"});
    	  impl.setStudies(List.of("SSC-10th", "Intermediate", "B.Tech"));
    	  
    	  return new ResponseEntity<Implementer>(impl, HttpStatus.OK);
        
      }
	  
//	  @GetMapping(path = "/report", produces = MediaType.APPLICATION_XML_VALUE) // jackson dataformat jar
//      public ResponseEntity<Implementer> showImplementers()
//      {
//    	  Implementer impl=new Implementer();
//    	  impl.setId(101);
//    	  impl.setName("Rohan");
//    	  impl.setCity("Pune");
//    	  impl.setTeamNames(new String[] {"achievers","dreamers","invincibles"});
//    	  impl.setStudies(List.of("SSC-10th", "Intermediate", "B.Tech"));
//    	  
//    	  return new ResponseEntity<Implementer>(impl, HttpStatus.OK);
//        
//      }
	
	
	  
	  @PostMapping("/save")
	  public ResponseEntity<String> saveImplementerInfo(@RequestBody Implementer implementer)
	  {
		  System.out.println(implementer);
		  String body="Data stored successfully!";
		  return new ResponseEntity<String>(body, HttpStatus.OK);
	  }
	  
	
	
}
