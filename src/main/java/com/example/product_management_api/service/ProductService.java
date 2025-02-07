package com.example.product_management_api.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.example.product_management_api.exception.*;
import com.example.product_management_api.model.Product;
import com.example.product_management_api.repository.ProductDao;

@Service // Marks this class as a service component
public class ProductService {

    private final ProductDao productDao; // Dependency for product data access

    public ProductService(ProductDao productDao) {
        this.productDao = productDao;
    }

    public Product getProductById(Long id) {
        // Fetch product by ID or throw exception if not found
        return productDao.getProductById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));
    }

    public Product createProduct(Product product) {
        // Check if product already exists
        List<Product> existingProducts = productDao.getAllProducts();
        boolean productExists = existingProducts.stream()
                .anyMatch(existingProduct -> existingProduct.getName().equalsIgnoreCase(product.getName()));
        if (productExists) {
            throw new ProductAlreadyExistsException(product.getName());
        }
        return productDao.createProduct(product);
    }

    public List<Product> getAllProducts() {
        // Fetch all products or throw exception if none found
        List<Product> products = productDao.getAllProducts();
        if (products.isEmpty()) {
            throw new NoProductsFoundException();
        }
        return products;
    }

    public Product updateProduct(Long id, Product productDetails) {
        // Update product if it exists or throw exception
        if (!productDao.existsById(id)) {
            throw new ProductNotFoundException(id);
        }
        try {
            return productDao.updateProduct(id, productDetails);
        } catch (Exception e) {
            throw new ProductUpdateException(id);
        }
    }

    public void deleteProduct(Long id) {
        // Delete product if it exists or throw exception
        if (!productDao.existsById(id)) {
            throw new ProductNotFoundException(id);
        }
        try {
            productDao.deleteProduct(id);
        } catch (Exception e) {
            throw new ProductDeletionException(id);
        }
    }
}
