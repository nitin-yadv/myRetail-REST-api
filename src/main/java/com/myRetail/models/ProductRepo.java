package com.myRetail.models;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ProductRepo extends MongoRepository<Product, String> {
	
	//This method will find product instance by its id.
	   
	  public Product findById(String id);
}
