package com.example.basic.first;

import org.springframework.stereotype.Service;

@Service
public class Circle implements Shape
{

	Circle()
	{
		System.out.println("Circle object created");
	}
	
   public void draw() 
	{	
		 System.out.println("Circle drawn");   
	}

}
