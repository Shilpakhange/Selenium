package com.mystore.product;

public class product {

	//non-static variable declaration for the class product
	public String name;
	double price;
	String skuid;
	
	//Method to purchase the product--
	
	public void purchase(int quantity)
	{
		System.out.println("In the method purchase() items: "+ quantity);
	}
	
	//Method to calculate the total price for purchased items--
	
	public double calculatePrice(int quantity)
	{
		double totalPrice;
		totalPrice= (quantity*price);
		return totalPrice;
	}
	
}

