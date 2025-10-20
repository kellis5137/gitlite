package com.sillek.gitlite.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.sillek.gitlite.model.User;
import com.sillek.gitlite.service.UserService;

import io.swagger.v3.oas.annotations.media.Schema;

@RestController
@Schema(description = "User API")
@RequestMapping(value = "/api/user/v1")
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/users")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@PostMapping(value = "/user", consumes = "application/json", produces = "application/json")
	public ResponseEntity createUser(@RequestBody User user) {
		User createdUser = userService.createUser(user);
		
		System.out.println("created user id - " + createdUser.getId());
		
//		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
//                .path("/{id}")
//                .buildAndExpand(createdUser.getId())
//                .toUri();
		return ResponseEntity.ok().build(); // created(location).build();
		
	}
}
