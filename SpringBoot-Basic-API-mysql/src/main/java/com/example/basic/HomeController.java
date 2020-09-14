package com.example.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController 
{
 @Autowired
 DemoRepo repo;
 
    @RequestMapping("/insert")
	public void insert(Demo demo)
	{
    	    repo.save(demo).toString();
	}
	
	@RequestMapping("/displayAll")                         //to display all content
	@ResponseBody
	public String displayAll()
	{
		return repo.findAll().toString();
	}
	
	@RequestMapping("/update")                            //to update data by primary key
	@ResponseBody
	public String update(Demo demo)
	{
		if(repo.findById(demo.getId()).isPresent())
		{	
		repo.save(demo);
		return repo.findAll().toString();
		}
		else
		{
			return "Sorry this type of id is not available in database.";
		}
	}
}
