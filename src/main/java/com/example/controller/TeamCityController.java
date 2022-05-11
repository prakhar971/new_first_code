package com.example.controller;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TeamCityController {
	
	@RequestMapping("/first")
	public String indexPage() {
		return "index";
	}
	
	
	@RequestMapping("/formData")
	public String formData() {
	
		return "";
	}

}
