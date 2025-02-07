package com.example.product_management_api.exception;

public class ProductDeletionException extends RuntimeException {
    public ProductDeletionException(Long id) {
        super("Failed to delete product with ID " + id + ". It may not exist.");
    }
}
