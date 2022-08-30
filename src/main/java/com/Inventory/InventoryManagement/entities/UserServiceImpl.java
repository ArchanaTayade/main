package com.Inventory.InventoryManagement.entities;

import java.util.ArrayList;
import java.util.List;

import com.Inventory.InventoryManagement.Services.UserService;

public class UserServiceImpl implements UserService {
	
	List<User> list;

public UserServiceImpl() {
	list = new ArrayList<>();
	list.add(new User(101,"Roshni","roshni@gmail.com","Admin","Roshni@123"));
	list.add(new User(102,"Archana","Archana12@gmail.com","Employee","Archana@321"));
	
	
}
	@Override
	public List<User> getUsers() {
		
		return list ;
	}
	@Override
	public User getUser(long UserId) {
		
		User u=null;
		for (User user:list)
		{
			if(user.getId()==UserId)
			{
				u=user;
				break;
			}
		}
		return u;
	}

}
