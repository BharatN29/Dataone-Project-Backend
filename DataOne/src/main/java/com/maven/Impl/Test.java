package com.maven.Impl;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Test {
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String hello(){
		return "Hello Bharat!";
	}
}
