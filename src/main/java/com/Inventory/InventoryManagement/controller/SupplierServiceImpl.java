package com.Inventory.InventoryManagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Inventory.InventoryManagement.Services.SupplierService;
import com.Inventory.InventoryManagement.entities.Supplier;

@Service
public class SupplierServiceImpl implements SupplierService{
	List<Supplier> list ;
	public SupplierServiceImpl () {
		list = new ArrayList<>();
		list.add(new Supplier(201,"Nepa Ltd","nepa@gmail.com","Pune",1122334455,101));
		list.add(new Supplier(202,"Indian Enterprise","inde@gmail.com","Mumbai",444556,101));
		
	}
	public List<Supplier> getsupplier(){
		 return list;
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
