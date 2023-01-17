package com.Monday.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

import com.Monday.demo.services.IHomeServices;
@RestController

public class Controller {
	@Autowired
	IHomeServices HS;
	@GetMapping(path="/message")
	
	public String getmessage()
	
	{
		return HS.getmessage();
	}
	
	

}
