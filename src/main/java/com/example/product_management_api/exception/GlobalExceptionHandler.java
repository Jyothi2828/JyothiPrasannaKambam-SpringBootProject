package com.example.product_management_api.exception;  
// Package for custom exception handling

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice  
// Handles exceptions globally for all controllers

public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)  
    // Handles unexpected runtime exceptions
    public ResponseEntity<String> handleRuntimeException(RuntimeException ex) {
        String message = "An unexpected error occurred while processing your request. Please try again later.";
        return new ResponseEntity<>(message, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ProductNotFoundException.class)  
    // Handles product not found exceptions
    public ResponseEntity<String> handleProductNotFoundException(ProductNotFoundException ex) {
        String message = "Oops! The product with the provided ID is not found in the inventory. Please verify the product ID and try again.";
        return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NoProductsFoundException.class)  
    // Handles cases when no products are available
    public ResponseEntity<String> handleNoProductsFoundException(NoProductsFoundException ex) {
        String message = "No products are currently available in the inventory. Please contact the store for more information.";
        return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ProductAlreadyExistsException.class)  
    // Handles cases when a product already exists
    public ResponseEntity<String> handleProductAlreadyExistsException(ProductAlreadyExistsException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }
}
