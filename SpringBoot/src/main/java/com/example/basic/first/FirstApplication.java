package com.example.basic.first;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) throws IOException 
	{
	 String type;	

	 
	 InputStreamReader in=new InputStreamReader(System.in);	
	 BufferedReader br=new BufferedReader(in);
	 ConfigurableApplicationContext context=SpringApplication.run(FirstApplication.class, args);
	
	System.out.println("Enter Triangle or Circle");
	type=br.readLine();
	Shape shape=(Shape)context.getBean(type);
	shape.draw();
	
	 
	

	}


}
