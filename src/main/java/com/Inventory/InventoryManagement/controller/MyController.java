package com.Inventory.InventoryManagement.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Inventory.InventoryManagement.Services.UserService;
import com.Inventory.InventoryManagement.entities.User;

@RestController
@RequestMapping("/api/v1")
public class MyController {
	@Autowired
	private UserService userService;

	@GetMapping("/Users")
	public List<User> getUser() {
		return userService.getUsers();
	}

	
	  @GetMapping ("/Users/{UserId}")
	 public User getUser (@PathVariable String UserId ) {
	  return this.userService.getUser(Long.parseLong(UserId)); }
	 

	@PostMapping("/Users")
	public User addUser(@RequestBody User user) 
	{
		
		return this.userService.addUser(user);
	}

	
	@PutMapping("/Users")
	public User updateUser(@RequestBody User user) 
	{
		return this.userService.updateUser(user);
	}
	
	@DeleteMapping("/deleteUser/{userId}")
	public ResponseEntity<Long> deleteUser(@PathVariable(value = "id") Long userId) {
	    return ResponseEntity.ok(userId);
	}
}
