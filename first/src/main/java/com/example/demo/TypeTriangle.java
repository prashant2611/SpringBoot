package com.example.demo;

import org.springframework.stereotype.Component;

@Component("type") // create type name object of this class in ApplicationContext ,otherwise default it will create "typetriangle" if we dont give any name.
public class TypeTriangle 
{
  
	void display()
	{
		System.out.println("Type of Triangle is Equilatral triangle");
	}
}
