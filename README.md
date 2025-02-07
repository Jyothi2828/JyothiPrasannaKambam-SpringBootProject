# **Product Management API by Jyothi Prasanna Kambam**

## **Description**  
A simple CRUD (Create, Read, Update, Delete) API built with Spring Boot for managing product information.

---

## **Technologies Used**  
- **Java**  
- **Spring Boot**  
- **PostgreSQL**  
- **Postman**

---

## **CRUD Operations**  
- **Create:** Add a new product (`POST /main/create-product`)  
- **Read:** Get all products (`GET /main/getallproducts`)  
- **Read by ID:** Get a specific product (`GET /main/get-product/{id}`)  
- **Update:** Update product details (`PUT /main/update-product/{id}`)  
- **Delete:** Remove a product (`DELETE /main/delete-product/{id}`)  

---

## **Setup Instructions**

### **1. Install PostgreSQL**
- Download PostgreSQL from [https://www.postgresql.org/download/](https://www.postgresql.org/download/).
- Follow the installer steps to complete the setup.
- Create a database for the project, for example:
Database Name: productdb Username: postgres
Password: yourpassword
---
### **2. Install Eclipse**
- Download Eclipse IDE from [https://www.eclipse.org/downloads/](https://www.eclipse.org/downloads/).
- Install and set up Eclipse for Java development.
  
---

### **3. Install Postman**
- Download Postman from [https://www.postman.com/downloads/](https://www.postman.com/downloads/).
- Install Postman to test API endpoints for CRUD operations.

---

## **How to Run the Project**
1. Clone or download this project.
2. Import the project into Eclipse as a Maven project.
3. Update `application.properties` with your PostgreSQL database details:
spring.datasource.url=jdbc:postgresql://localhost:5432/productdb 
spring.datasource.username=postgres spring.datasource.password=yourpassword
4. Run the project as a **Spring Boot Application**.
5. Use Postman to test the API endpoints.

---

## **Sample API Endpoints**
- **POST** `/main/create-product`: Create a new product  
- **GET** `/main/getallproducts`: Retrieve all products  
- **GET** `/main/get-product/{id}`: Retrieve a product by ID  
- **PUT** `/main/update-product/{id}`: Update a product  
- **DELETE** `/main/delete-product/{id}`: Delete a product  

---

## **Screenshots**

### 1. **Create Product**
![Create Product](./screenshots/create-product.png)

### 2. **Created Product**
![Created Product](./screenshots/created-product.png)

### 3. **Get All Products**
![Get All Products](./screenshots/GetAllProducts.png)

### 4. **Get Product by ID**
![Get Product by ID](./screenshots/getproductbyid.png)

### 5. **Update Product**
![Update Product](./screenshots/updatingproduct.png)

### 6. **Delete Product**
![Delete Product](./screenshots/Delete-product.png)

### 7. **Validating Product Creation**
![Validating Creation](./screenshots/validatingcreationofproduct.png)

### 8. **Validating Product Updation**
![Validating Updation](./screenshots/validating-updation.png)

### 9. **Validating Product Deletion**
![Validating Deletion](./screenshots/validating-deletion.png)

---
