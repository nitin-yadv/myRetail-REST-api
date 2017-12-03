package com.myRetail.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product
{

	@Id
	String id;
	String name;
	String current_price;
	String currency_code;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCurrent_price() {
		return current_price;
	}
	public void setCurrent_price(String current_price) {
		this.current_price = current_price;
	}
	public String getCurrency_code() {
		return currency_code;
	}
	public void setCurrency_code(String currency_code) {
		this.currency_code = currency_code;
	}
	
	@Override
	  public String toString() {
	    return "Booking{" +
	              "id=" + id + 
	              ", name=" + name + 
	              ", current_price=" + current_price + 
	              ", currency_code=" + currency_code +
	              "}";
	  }
}

	