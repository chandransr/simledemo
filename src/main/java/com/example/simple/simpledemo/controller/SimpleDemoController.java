package com.example.simple.simpledemo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class SimpleDemoController {
	@RequestMapping(value="/simple")
	public String simpledemo(@RequestParam String userEmail) {
		return "Hello this is userPreferences"+userEmail;
	}


}
