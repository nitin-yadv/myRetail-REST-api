# myRetail
The repository contains source code for myRetail RESTFUL service that can retrieve product and price details by ID
The service provides HTTP GET and PUT functionality .

  * GET product id, name, and current price for an id passed as input.
  * UPDATE price for an id passed as an input.

## Technology Used 
Role | Technology
-----|-----------
Source Control | Git
Runtime | Java 8
Database | Mongodb
Repository | MongoRepository
HTTP Server | Spring Boot
Task Automation | Maven
Unit Tests | JUnit
IDE | Eclipse

## Getting Started
 * Unzip the project "myRetail".
 * Navigate to code
 	`cd myRetail`
 * Finally, run the project
	`mvn spring-boot:run`

 * If using Eclipse :
 * Import it as an existing Maven project into your Eclipse workspace. 
 * Click run as -> Spring Boot App
  
## Interacting with the application


Perform a GET request on the url `http://localhost:8080/products/show-all` will return a JSON object containing the name, current_price and currency_code of the all products.

Perform a GET request on the url  `http://localhost:8080/products/add?name={name}&current_price={price}&currency_code=USD`

Perform a PUT request on the url `http://localhost:8080/products/update?id={id}&current_price={price}`to update the current_price of product with specific id.

Perform a GET request on the url `http://localhost:8080/products/read?id={id}` will return a JSON object containing the name, current_price and currency_code of the requested product.

Perform a GET request on the url `http://localhost:8080/products/delete?id={id}` to delete the product from database. 

