package com.example.basic;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepo extends JpaRepository<Demo,Integer>
{

}
