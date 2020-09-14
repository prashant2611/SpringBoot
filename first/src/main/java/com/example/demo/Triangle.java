package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("tri")    // create tri name object of this class in ApplicationContext ,otherwise default it will create "triangle" if we dont give any name.
//@Scope(value="prototype")
public class Triangle implements Shape
{  

	
	@Autowired
	TypeTriangle typeTriangle;
	
	Triangle()
	{
		System.out.println("Triangle object created");
	}
	
	public void draw() 
	{
	 System.out.println("Triangle drawn");
	 typeTriangle.display();
	}

	
	
}
