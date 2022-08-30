package com.Inventory.InventoryManagement.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.stereotype.Service;

import com.Inventory.InventoryManagement.Services.UserService;
import com.Inventory.InventoryManagement.entities.User;

@Service
public class UserServiceImpl  implements UserService {

	List<User> list ;
	public UserServiceImpl () {
		list = new ArrayList<>();
		list.add(new User(101,"Roshni","Roshni@123","Admin","roshni@gmail.com",123456789, 0));
		list.add(new User(102,"Employee","Archana@321","Employee","Archana12@gmail.com",112233444, 0));
		
	}
	public List<User> getUsers(){
		 return list;
	 }
	 
		public User getUser1(long Userid) {
			User u = null;
			for (User user:list)
			{
				if(user.getid()==Userid)
					u=user;
				break;
			}
		
		return u;
	}
		public User updateUser(User user) {
			list.forEach(new Consumer<User>(){
				
				public void accept(User e) {
					if(e.getid()==user.getid()) {
						e.setName(user.getName());
						e.setEmail(user.getEmail());
						e.setPassword(user.getPassword());
						e.setRole(user.getRole());
						e.setPhone(user.getPhone());
						
					}
						
				}
			});
			return user;
		}
		
		
		
	public User getUser(long Userid) {
		// TODO Auto-generated method stub
		return null;
	}

	public User addUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
	


