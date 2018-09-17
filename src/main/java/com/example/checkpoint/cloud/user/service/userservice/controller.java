package com.example.checkpoint.cloud.user.service.userservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class controller {

	
	@RequestMapping("/user/go")
	public @ResponseBody String getEndpointMsg()
	{
		return "You have reach user-service.";
	}
	
	
}
