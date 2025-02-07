package com.example.product_management_api.exception;

public class ProductUpdateException extends RuntimeException {
    public ProductUpdateException(Long id) {
        super("Unable to update product with ID " + id + ". Please verify the product details.");
    }
}
