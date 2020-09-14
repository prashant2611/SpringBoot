package com.example.basic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Demo 
{
 @Id	
 private int id;
 private String name;
 private String tech;
 
 
public String getTech() {
	return tech;
}
public void setTech(String tech) {
	this.tech = tech;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Database Demo [id=" + id + ", name=" + name + ", tech=" + tech + "]";
}


 
 
}
