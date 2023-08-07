package com.abecrudweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abecrudweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	
	@GetMapping
	public ResponseEntity<User> FindAll() {
		User u = new User(1L, "maria", "Maraia@gmail.com", "999999999", "12345");
		return ResponseEntity.ok().body(u);
	}

}
