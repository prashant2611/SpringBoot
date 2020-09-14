package com.example.basic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.*;

public interface DemoRepo extends JpaRepository<Demo,Integer>           // jpaRepo is internallt extend CrudRepo , if we want to display our data in jason format then we have to use JpaRepo
{

	List<Demo> findByTech(String tech);
	List<Demo> findByIdGreaterThan(int id);
	
	@Query("from Demo where Tech=?1 order by Name")
	List<Demo> findByTechSorted(String tech);
}
