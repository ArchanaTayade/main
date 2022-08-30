package com.Inventory.InventoryManagement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Inventory.InventoryManagement.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{ 
	/*User findById (int Id);
	List<User> findByName (String Name);
	List<User> findByEmail (String Email);
	List<User> findByRole (String Role);
	List<User> findByPassword (String Password);
	List<User> findByPhone (int Phone);
	List<User> findById (String Id);*/
	
}
