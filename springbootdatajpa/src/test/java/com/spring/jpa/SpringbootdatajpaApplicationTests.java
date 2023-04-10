package com.spring.jpa;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.spring.jpa.entities.Product;
import com.spring.jpa.repositories.ProductRepository;

@SpringBootTest
class SpringbootdatajpaApplicationTests {

	@Autowired
	ApplicationContext ctx;
	
	//@Test
	void saveProduct() {

		Product p = new Product();
		p.setId(2L);
		p.setName("prod 2");
		p.setDescription("prod 2 desc");
		p.setPrice(300.5d);

		ProductRepository repo = ctx.getBean(ProductRepository.class);
		repo.save(p);
		System.out.println("Product saved to db");
	}

	//@Test
	void getProduct() {
		Product ans = null;

		ProductRepository repo = ctx.getBean(ProductRepository.class);
		Optional<Product> productOptional = repo.findById(1L);
		if (productOptional.isPresent())
			ans = productOptional.get();

		if (ans != null)
			System.out.println(ans);
		else
			System.out.println("prod is null");
	}

	//@Test
	void updateProduct() {
		Product p = new Product();
		p.setId(2L);
		p.setName("prod 2");
		p.setDescription("prod 2 desc changed");
		p.setPrice(300.5d);
		ProductRepository repo = ctx.getBean(ProductRepository.class);
		repo.save(p);
		System.out.println("product saved.");
	}
	
	//@Test
	void getAllProducts()
	{
		ProductRepository repo=ctx.getBean(ProductRepository.class);
		Iterable<Product> products = repo.findAll();
		for(Product p:products)
			System.out.println(p);
	}
	
	//@Test
	void getProdByName()
	{
		ProductRepository repo=ctx.getBean(ProductRepository.class);
		List<Product> products = repo.findByName("prod 1");
		for(Product p:products)
			System.out.println(p);
	}
	
	@Test
		void getProdByNameAndId()
		{
			ProductRepository repo=ctx.getBean(ProductRepository.class);
			List<Product> products = repo.findByNameAndId("prod 1",1L);
			for(Product p:products)
				System.out.println(p);
		}
}
