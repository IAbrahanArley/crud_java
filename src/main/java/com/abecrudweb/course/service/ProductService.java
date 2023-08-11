package com.abecrudweb.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abecrudweb.course.entities.Product;
import com.abecrudweb.course.repositories.ProductRepository;

@Service

public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findALl(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
	
}
