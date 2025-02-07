package com.example.product_management_api.exception;

public class NoProductsFoundException extends RuntimeException {
    public NoProductsFoundException() {
        super("No products found in the inventory. Please contact the store.");
    }
}
