package com.example.product_management_api.exception;

public class ProductCreationException extends RuntimeException {
    public ProductCreationException(String message) {
        super("Failed to create product: " + message);
    }
}
