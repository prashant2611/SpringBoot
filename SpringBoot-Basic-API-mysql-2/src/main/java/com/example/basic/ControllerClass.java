package com.example.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerClass 
{
  @Autowired	
  ServiceClass service;
	
	@RequestMapping("/insert")
	@ResponseBody
	public String insert(DatabaseClass data)
	{
		 return service.insert(data);
		 
	}
	
	@GetMapping("/")
	@ResponseBody
	public String display()
	{
	  return service.display();
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public String update(DatabaseClass data)
	{
		return service.update(data);
	}
	
}
