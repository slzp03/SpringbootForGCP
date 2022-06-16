package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping(value = "/home")
	public String main() {
		return "index";
	}
	
	@RequestMapping(value = "/another")
	public String home() {
		return "myTest";
	}
}
