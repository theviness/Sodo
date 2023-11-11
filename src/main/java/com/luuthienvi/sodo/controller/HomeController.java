package com.luuthienvi.sodo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "Public home";
	}
	
	@GetMapping("/secured")
	public String securedHome() {
		return "Secured home";
	}
}
