package com.example.product_management_api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.product_management_api.model.Product;
import com.example.product_management_api.service.ProductService;

@RestController
@RequestMapping("/main")
public class ProductController {

	private final ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	// Create Product
	@PostMapping("/create-product")
	public Product createProduct(@RequestBody Product product) {
		return productService.createProduct(product);
	}

	// Get All Products
	@GetMapping("/getallproducts")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	// Get Product by ID
	@GetMapping("/get-product/{id}")
	public Product getProductById(@PathVariable Long id) {
		return productService.getProductById(id);
	}

	// Update Product
	@PutMapping("/update-product/{id}")
	public Product updateProduct(@PathVariable Long id, @RequestBody Product productDetails) {
		return productService.updateProduct(id, productDetails);
	}

	// Delete Product
	@DeleteMapping("/delete-product/{id}")
	public String deleteProduct(@PathVariable Long id) {
		productService.deleteProduct(id);
		return "Product deleted successfully!";
	}

}