package com.example.product_management_api.repository;  
// Package for handling data access logic

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;  
// Marks this class as a Spring-managed data repository

import com.example.product_management_api.exception.ProductNotFoundException;
import com.example.product_management_api.model.Product;

@Repository  
// Indicates that this class provides CRUD operations for Product entities

public class ProductDaoImpl implements ProductDao {  
    // Implementation of the ProductDao interface

    private final ProductRepository productRepository;  
    // Dependency for database operations

    public ProductDaoImpl(ProductRepository productRepository) {  
        // Constructor injection for dependency
        this.productRepository = productRepository;
    }

    @Override
    public boolean existsById(Long id) {
        return productRepository.existsById(id);  
        // Checks if a product exists by ID
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);  
        // Saves a new product
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);  
        // Retrieves a product by ID
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();  
        // Retrieves all products
    }

    @Override
    public Product updateProduct(Long id, Product productDetails) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));  
        // Fetches the product or throws an exception if not found

        product.setName(productDetails.getName());
        product.setDescription(productDetails.getDescription());
        product.setPrice(productDetails.getPrice());
        return productRepository.save(product);  
        // Updates and saves the product
    }

    @Override
    public void deleteProduct(Long id) {
        if (!productRepository.existsById(id)) {
            throw new ProductNotFoundException(id);  
            // Throws an exception if the product does not exist
        }
        productRepository.deleteById(id);  
        // Deletes the product by ID
    }
}
