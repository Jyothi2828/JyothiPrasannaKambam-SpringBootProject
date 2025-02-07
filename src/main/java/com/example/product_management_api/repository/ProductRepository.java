package com.example.product_management_api.repository;  
// Package for handling data access logic

import org.springframework.data.jpa.repository.JpaRepository;  
// Import for JpaRepository to provide CRUD operations

import com.example.product_management_api.model.Product;  
// Importing the Product entity

public interface ProductRepository extends JpaRepository<Product, Long> {  
    // Repository interface for Product entity with Long as the primary key type
}
