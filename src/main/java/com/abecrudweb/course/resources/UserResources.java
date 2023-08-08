package com.abecrudweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abecrudweb.course.entities.User;
import com.abecrudweb.course.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	
	@Autowired
	private UserService sevice;
	
	@GetMapping
	public ResponseEntity <List<User>> FindAll() {
		List<User> list = sevice.findALl();
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = sevice.findById(id);
		return ResponseEntity.ok().body(obj); 
		
	}
	
}
