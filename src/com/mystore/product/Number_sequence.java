package com.mystore.product;

public class Number_sequence {

	public static void main(String[] args) {
		// Print the odd numbers from 1 to 50
		for(int i=0;i<50;i++)
		{
			if (i>20)
			{
				break;
			}
			else if(i%2==0)
			{
				continue;
				
			}
			else 
			{
					
				System.out.println(i);

			}
		}

	}

}
