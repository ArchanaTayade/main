package com.Inventory.InventoryManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Inventory.InventoryManagement.Services.SupplierService;

import com.Inventory.InventoryManagement.entities.Supplier;

@RequestMapping("/api/v1")
public class SupplierController {
		@Autowired
		private SupplierService supplierService;

	
	@GetMapping("/suppliers")
	public List<Supplier>getSupplier(){
		
		return supplierService.getSuppliers();
	}

	}

