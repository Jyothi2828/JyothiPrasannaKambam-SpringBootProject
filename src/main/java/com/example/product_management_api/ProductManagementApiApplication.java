package com.example.product_management_api; 

import org.springframework.boot.SpringApplication; // Import for starting the Spring Boot application
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Import for enabling auto-configuration and component scanning

@SpringBootApplication(scanBasePackages = "com.example.product_management_api")

public class ProductManagementApiApplication { // Main class of the application

	public static void main(String[] args) { // Main method to run the application

		SpringApplication.run(ProductManagementApiApplication.class, args);
		// Starts the Spring Boot application
	}
}
