package com.mystore.product;

public class Retail_shop {

	public static void main(String[] args) {
       int itema=200, itemb=100,itemc=300;
       double price;
       
       price=((2*itema)+(3*itemb)+(5*itemc));
       price=price-(price*0.1);
            
       
       System.out.println("Total price of products is:" +price);

	}

}

