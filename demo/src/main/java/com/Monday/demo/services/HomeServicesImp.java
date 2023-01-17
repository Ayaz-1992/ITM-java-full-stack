package com.Monday.demo.services;

import org.springframework.stereotype.Service;

@Service
public class HomeServicesImp implements IHomeServices {
	@Override
	public String getmessage()
	{
		return "WELCOME Service";
	}

}
