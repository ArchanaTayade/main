package com.Inventory.InventoryManagement.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Inventory.InventoryManagement.Repository.UserRepository;
import com.Inventory.InventoryManagement.entities.User;

@Service
public interface UserService {
	public List<User>getUsers();
	 public User getUser(long UserId);
	public User addUser(User user);
	public User updateUser(User user);
	 
}
	
