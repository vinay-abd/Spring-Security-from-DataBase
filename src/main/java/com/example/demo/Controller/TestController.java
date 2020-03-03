package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class TestController 
{
	@RequestMapping("/data")
	public String fetchData()
	{
		return "you are successfully fetched data.......THANK YOU USER or ADMIN";
	}
	
	@RequestMapping("/secure/data")
	public String getData()
	{
		return "you are fetching Secured DATA............THANK YOU ADMIN";
	}

}
