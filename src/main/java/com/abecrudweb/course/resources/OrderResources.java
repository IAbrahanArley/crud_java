package com.abecrudweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abecrudweb.course.entities.Order;
import com.abecrudweb.course.service.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResources {
	
	@Autowired
	private OrderService sevice;
	
	@GetMapping
	public ResponseEntity <List<Order>> FindAll() {
		List<Order> list = sevice.findALl();
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = sevice.findById(id);
		return ResponseEntity.ok().body(obj); 
		
	}
	
}
