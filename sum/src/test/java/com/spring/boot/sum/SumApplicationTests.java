package com.spring.boot.sum;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SumApplicationTests {

	@Autowired
	SumNumbers obj;
	
	@Test
	void showSum() {
		obj.calculateSum(2, 3);
	}

}
