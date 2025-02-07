# Product Management API

## Description  
This is a Product Management API built using Spring Boot. It provides endpoints for creating, retrieving, updating, and deleting products. The API allows users to manage product information efficiently and supports various operations to maintain a product catalog.

## Key Features  
- **Create:** Create new products with detailed information.  
- **Retrieve:** Retrieve a list of all products or a specific product by ID.  
- **Update:** Update existing product details.  
- **Delete:** Delete products from the catalog.  

## Technologies Used  
- **Java**  
- **Spring Boot**  
- **PostgreSQL**  
- **RESTful API principles**

## Database  
The application uses **PostgreSQL** as the database to store and manage product information.

## Project Flow  
The application operates as a **RESTful API**, with a controller layer handling incoming requests and delegating business logic to the service layer. The `ProductController` class defines the endpoints for product management.

## Endpoints  
- **POST `/main/create-product`**: Creates a new product.  
- **GET `/main/getallproducts`**: Retrieves all products.  
- **GET `/main/get-product/{id}`**: Retrieves a product by its ID.  
- **PUT `/main/update-product/{id}`**: Updates a product by its ID.  
- **DELETE `/main/delete-product/{id}`**: Deletes a product by its ID.


