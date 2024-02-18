package com.satish.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@CrossOrigin(origins = { "*" })
@RequestMapping("/satish")
public class RestController {
  List<String> li=new ArrayList<String> ();
  
	Logger log=LoggerFactory.getLogger(RestController.class);
	
	@GetMapping("/hello")
	public String hello() {
		
		log.info("logging going well ");
		
		return "Hello";
	}
	
	@GetMapping("/good")
	public String good() {
		
		log.warn(" waring from good logging");
		return "Good";
	}
	
	
}
