package com.spring.jpa.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.jpa.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	
       List<Product> findByName(String name);
       List<Product> findByNameAndId(String name, Long id);
	

}
