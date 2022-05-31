package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mirepository.UserRepository;
import com.example.demo.model.User;



@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("api/v1/")
public class UserDetailsController {
	
	
	@Autowired
	private UserRepository userrepository;
	
	
	@GetMapping("/users")
	public List<User> getAllEmployees(){
		return userrepository.findAll();
	}
	@PostMapping("/users")
	public User createUser(@RequestBody User user)
	{
		return userrepository.save(user);
	}
	}
