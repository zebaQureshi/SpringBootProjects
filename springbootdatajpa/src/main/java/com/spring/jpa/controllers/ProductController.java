package com.spring.jpa.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.entities.Product;
import com.spring.jpa.repositories.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductRepository repo;

	@GetMapping
	public Iterable<Product> getAllProduct() {
		return repo.findAll();
	}

	@PostMapping
	public Product createProduct(@RequestBody Product p) {
		return repo.save(p);
	}

	@PutMapping
	public Product updateProduct(@RequestBody Product p) {
		return repo.save(p);
	}

	@GetMapping("/{id}")
	public Product getProductById(@PathVariable("id") Long id) {
		Optional<Product> productsOptional = repo.findById(id);

		Product p = productsOptional.get();
		return p;
	}

	@DeleteMapping("/{id}")
	public void deleteProductById(@PathVariable("id") Long id) {
		repo.deleteById(id);
	}
}
