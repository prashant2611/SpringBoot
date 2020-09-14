package com.example.basic;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Another_home_controller
{
   /*  
    //Using HttpServlet request and response
	@RequestMapping("Home1")
	public String display(HttpServletRequest req)
	{
		HttpSession session=req.getSession();
		String name= req.getParameter("name");
		System.out.println("Hello "+name);
		session.setAttribute("name", name);
	    return "Home1";
	}
	*/
	
	/*
	 * //Without using HttpServlet
	 * 
	 * @RequestMapping("Home1") public String display(@RequestParam("myname") String
	 * name,HttpSession session) //when we use @RequestParam then we cannot pass
	 * value using name,we have to use myname at browser side {
	 * System.out.println("Hello "+name); session.setAttribute("name", name); return
	 * "Home1"; }
	 */
	
	
	/*
	 * @RequestMapping("Home1") public ModelAndView display(String name) {
	 * ModelAndView mv=new ModelAndView(); mv.addObject("name",name);
	 * mv.setViewName("Home1"); return mv;
	 * 
	 * }
	 */
	
	
	//Accept into Object 
	@RequestMapping("Home1")
	public ModelAndView display(Demo demo)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj",demo);
		mv.setViewName("Home1");
		return mv;
		
	}
}
