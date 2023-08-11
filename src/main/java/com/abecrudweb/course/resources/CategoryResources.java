package com.abecrudweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abecrudweb.course.entities.Category;
import com.abecrudweb.course.service.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResources {
	
	@Autowired
	private CategoryService sevice;
	
	@GetMapping
	public ResponseEntity <List<Category>> FindAll() {
		List<Category> list = sevice.findALl();
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category obj = sevice.findById(id);
		return ResponseEntity.ok().body(obj); 
		
	}
	
}
