package com.zeba.spring.boot.springbootprj1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zeba.spring.boot.springbootprj1.dao.Dao;

@Component
public class Service {
	
	Dao dao;
	
	@Autowired
	Service(Dao dao)
	{
		System.out.println("service bean created.");
		this.dao=dao;
		
	}
	
	public void save()
	{
		System.out.println("In the service class save method");
		dao.create();
	}

}
