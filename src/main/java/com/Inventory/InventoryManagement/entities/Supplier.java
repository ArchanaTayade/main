package com.Inventory.InventoryManagement.entities;

import java.util.List;

import com.Inventory.InventoryManagement.Services.SupplierService;

public class Supplier implements SupplierService{
    private int id;
    private String name;
    private String email;
    private int phone;
    private String add;
    
    public Supplier(int i, String string, String string2, String string3, int j, int k) {
    	
    }

	@Override
	public String toString() {
		return "Supplier [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", add=" + add + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public Supplier(int id, String name, String email, int phone, String add) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.add = add;
	}

	@Override
	public List<Supplier> getSuppliers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Supplier> getSupplier() {
		// TODO Auto-generated method stub
		return null;
	}
    
 }
