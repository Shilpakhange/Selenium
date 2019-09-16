package com.mystore.product;

public class productTest {

	public static void main(String[] args) {
           //declare objects of type class product--
		
		product Iphone=new product();
		product Desktop=new product();
		
		Iphone.name="Iphone1";
		Iphone.price=299.25;
		Iphone.skuid="phone01";
		
		//printing values of Iphone to the console--
		System.out.println(Iphone.name);
		System.out.println(Iphone.price);
		System.out.println(Iphone.skuid);
		
		Desktop=Iphone;
		
		/*
		 * Desktop.name="Desktop"; Desktop.price=150.00; Desktop.skuid="Desktop01";
		 */
		System.out.println(Desktop.name);
		System.out.println(Desktop.price);
		System.out.println(Desktop.skuid);
		
		System.out.println(Iphone.name);
		System.out.println(Iphone.price);
		System.out.println(Iphone.skuid);
		
		
		//Calling methods using objects--
		Iphone.purchase(2);
		Iphone.calculatePrice(2);
		System.out.println(Iphone.calculatePrice(2));

	}

}
