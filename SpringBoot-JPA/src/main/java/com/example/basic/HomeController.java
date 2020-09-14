package com.example.basic;

import java.util.List; 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController 
{
	@Autowired
	DemoRepo repo;

	
	@RequestMapping("/")
	public String display()
	{
		
	    return "Home.jsp";
	}
	
	
/*     Use CurdRepository for fetting data
 
	//For Accepting data from user and stored it into the database
	
	  @RequestMapping("/addDemo") 
	  public String add(Demo demo) 
	  { 
		  repo.save(demo);
		  return "Home.jsp";                 //Need to change in Home.jsp as per requirement
	  }
	  
	  
	//For getting data from database and display to user
	
	  @RequestMapping("/getDemo") public ModelAndView get(@RequestParam int id) {
	  ModelAndView mv=new ModelAndView("ShowHome.jsp"); Demo
	  demo=repo.findById(id).orElse(new Demo());
	  
	  System.out.println(repo.findByTech("Java"));
	  System.out.println(repo.findByIdGreaterThan(102));
	  System.out.println(repo.findByTechSorted("Java"));
	  
	  mv.addObject(demo); return mv; }
	 
	
	
	//Display all data which is in database to the client
	
	  @RequestMapping("/displayDemo")
	  
	  @ResponseBody public String displayAll() { return repo.findAll().toString();
	  
	  }
	 

	  
	//Display data as per the requirement of user
	  @RequestMapping("/display/{id}")
	  @ResponseBody
	  public String displayRequest(@PathVariable("id") int id)
	  {
		  return repo.findById(id).toString();
	  }
*/	  
	
	
	  @PostMapping(path="/addDemo" ) 
	  public Demo add(@RequestBody Demo demo) 
	  { 
		  repo.save(demo);
		  return demo;                 //Need to change in Home.jsp as per requirement
	  }
	
	
	
	
	
	//Display all data which is in database to the client in jason format
	 @GetMapping(path="/display")
	 @ResponseBody 
	 public List<Demo> displayAll() 
	 {
		 return repo.findAll();
	  }
	
	 
	  //Display data as per the requirement of user in jason format
	  @RequestMapping("/display/{id}")
	  @ResponseBody
	  public Optional<Demo> displayRequest(@PathVariable("id") int id)
	  {
		  return repo.findById(id);
	  }
	
}
