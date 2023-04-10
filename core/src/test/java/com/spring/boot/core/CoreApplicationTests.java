package com.spring.boot.core;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.boot.core.service.PaymentService;

@SpringBootTest
class CoreApplicationTests {

	@Autowired
	PaymentService service;
	
	@Test
	void checkDependency() {
		service.checkDao();
	}

}
