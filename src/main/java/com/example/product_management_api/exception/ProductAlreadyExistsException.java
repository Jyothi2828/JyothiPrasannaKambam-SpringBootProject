package com.example.product_management_api.exception;

public class ProductAlreadyExistsException extends RuntimeException {
    public ProductAlreadyExistsException(String productName) {
        super("Product '" + productName + "' already added. Try adding a product with a different name.");
    }
}
