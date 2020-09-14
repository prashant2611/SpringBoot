package com.example.basic;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController 
{

	@RequestMapping("Home")
	public String display()
	{
		System.out.println("Hello Prashant!");
	    return "Home";
	}
	
	/*
	 * @RequestMapping("Home1") public String display1() {
	 * System.out.println("Hello Prashant!"); return "Home1"; }
	 */
	

}
