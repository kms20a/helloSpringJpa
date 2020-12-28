package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloSpringJpaController {
	@GetMapping("/")
	public String helloworld() {
		System.out.println("helloworld");
		return "index";
	}
}
