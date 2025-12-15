package com.example.Tebz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstRestController {

	
	@RequestMapping("/hello")
	public void sayHello()
	{
		
		System.out.println("SayHello");
	}
	
	
}
