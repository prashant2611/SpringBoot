package com.example.basic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class ServiceClass 
{
	@Autowired
	DatabaseRepository repo;
 
	public String insert(DatabaseClass data)             // for insert data
	{
		return repo.save(data).toString();
	}
	
	public String display()                             //for display data
	{
		return repo.findAll().toString();
	}
	
	public String update(DatabaseClass data)
	{
		if(repo.findById(data.getId()).isPresent())
		{
		 return repo.save(data).toString();	
		}
		else
		{
			return "Sorry this data is not present in our database.";
		}
	}
}
