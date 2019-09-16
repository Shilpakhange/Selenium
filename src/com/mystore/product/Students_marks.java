package com.mystore.product;

import java.util.Scanner;

public class Students_marks {

	public static void main(String[] args) {
//Declare marks of different subjects
		int maths,physics,chemistry,english,computer;
		double percentage,finalscore;
		boolean x;
		// Declare object for accepting input from user
		Scanner marks=new Scanner(System.in);
		
		
		do
		{
			System.out.println("Enter marks for Maths :");
			maths=marks.nextInt();
			System.out.println("Enter marks for Physics :");
			
			physics=marks.nextInt();
			System.out.println("Enter marks for Chemistry :");
			chemistry=marks.nextInt();
			System.out.println("Enter marks for English :");
			english=marks.nextInt();

			System.out.println("Enter marks for Computer :");
			computer=marks.nextInt();
			finalscore=maths+physics+chemistry+english+computer;
			percentage=finalscore/5;
			System.out.println("The finalscore of the student is :" +finalscore);
			System.out.println("The percentage of the student is :" +percentage);
			
			if (percentage>90)
				System.out.println("Excellent");
			else if(percentage>75)
				System.out.println("Distinction");
			else if(percentage>60)
				System.out.println("FirstClass");
			else if(percentage>50)
				System.out.println("SecondClass");
			else System.out.println("Poor");
			
			
			System.out.println("Do you want to contiue for other student");
			x=marks.nextBoolean();

		}while(x);
		
		
			

				
		
		{
		
		
		
		}
	}

}
