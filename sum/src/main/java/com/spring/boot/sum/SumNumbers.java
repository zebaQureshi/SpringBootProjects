package com.spring.boot.sum;

import org.springframework.stereotype.Component;

@Component
public class SumNumbers {
	
	public void calculateSum(int x, int y)
	{
		System.out.println("Sum is:"+(x+y));
	}

}
