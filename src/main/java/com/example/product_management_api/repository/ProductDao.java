package com.example.product_management_api.repository;  
// Package for handling database operations

import java.util.List;
import java.util.Optional; // Import for handling optional return values

import com.example.product_management_api.model.Product;  
// Importing Product model

public interface ProductDao {  
    // Interface for Product Data Access Object (DAO)

    boolean existsById(Long id);  
    // Checks if a product with the given ID exists

    Product createProduct(Product product);  
    // Creates a new product

    Optional<Product> getProductById(Long id);  
    // Retrieves a product by its ID, wrapped in Optional

    List<Product> getAllProducts();  
    // Retrieves all products

    Product updateProduct(Long id, Product productDetails);  
    // Updates an existing product

    void deleteProduct(Long id);  
    // Deletes a product by its ID
}
