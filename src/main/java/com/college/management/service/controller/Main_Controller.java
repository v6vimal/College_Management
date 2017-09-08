package com.college.management.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main_Controller 
{
	@RequestMapping("/")
	public String test()
	{
		return "Kishore & Vimal Projects Using GitHub.com";
	}
}
