package com.demo.springboot.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/")
    String getHealth() {
		System.out.println("Rest Service is up and running");
		return "Rest Service is up and running";
    }

	@PostMapping("/posthealth")
	String postHealth() {
		System.out.println("Rest Service is up and running");
		return "Rest Service is up and running";
    }
}
