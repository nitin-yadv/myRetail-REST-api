package com.myRetail.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myRetail.models.Product;
import com.myRetail.models.ProductRepo;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	ProductRepo productRepo;
	/**
	 * GET /add  --> Add a new product.
	 */
	@RequestMapping("/add")
	public Map<String, Object> add(Product product) {
		product = productRepo.save(product);
		Map<String, Object> mapData = new HashMap<String, Object>();
		mapData.put("Product Added", product);
	    return mapData;
	}
	
	/**
	 * GET --> Read a product by id from the database.
	 */
	@RequestMapping (value = "/{id}", method = RequestMethod.GET)
	public Map<String, Object> read(@RequestParam String id) {
		Product product = productRepo.findOne(id);
		Map<String, Object> mapData = new HashMap<String, Object>();
		mapData.put("Product", product);
		return mapData;
	}
	
	/**
	 * GET /update  --> Update a product
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    
	//@RequestMapping("/update")
	public Map<String, Object> update(@RequestParam String id, @RequestParam String current_price) {
		Product product = productRepo.findOne(id);
		product.setCurrent_price(current_price);
		product = productRepo.save(product);
		Map<String, Object> mapData = new HashMap<String, Object>();
		mapData.put("Product Updated", product);
	    return mapData;
	}
	
	/**
	 * GET /delete  --> Delete a product from the database.
	 */
	@RequestMapping("/delete")
	public Map<String, Object> delete(@RequestParam String id) {
		productRepo.delete(id);
		Map<String, Object> mapData = new HashMap<String, Object>();
		mapData.put("Product Deleted", id);
		
	    return mapData;
	}
	
	/**
	 * GET /show  --> Show all products from database.
	 */
	@RequestMapping("/show-all")
	public Map<String, Object> readAll() {
		List<Product> products = productRepo.findAll();
		Map<String, Object> mapData = new HashMap<String, Object>();
		mapData.put("Total Products", products.size());
		mapData.put("Products", products);
	    return mapData;
	    }
}
