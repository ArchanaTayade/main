package com.Inventory.InventoryManagement.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Inventory.InventoryManagement.entities.Supplier;

@Service
public interface SupplierService {
	public List<Supplier>getSuppliers();

	public List<Supplier> getSupplier();
}
