package com.zeba.spring.boot.springbootprj1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.zeba.spring.boot.springbootprj1.service.Service;

@SpringBootTest
class Springbootprj1ApplicationTests {

	@Autowired
	ApplicationContext context;
	
	@Test
	void testService() {
		Service bean = context.getBean(Service.class);
		bean.save();
	}

}
