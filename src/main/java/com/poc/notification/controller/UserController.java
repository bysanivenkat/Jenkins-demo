package com.poc.notification.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping
	public String UserTest(@PathVariable(name="name") String name) {
		
		return "Hi" + name + "welcome to the new jenkins CI/CD pipe line success";
	}
}
