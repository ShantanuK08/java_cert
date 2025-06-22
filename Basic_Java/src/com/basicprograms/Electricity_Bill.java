//To calculate Electricity Bill

package com.basicprograms;

import java.util.Scanner;

public class Electricity_Bill {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n,u;
		String name;
		double amt=0,total=0;
		System.out.println("Enter consumer's name");
		name=in.nextLine();
		System.out.println("Enter consumer's number");
		n=in.nextInt();
		System.out.println("Enter units consumed");
		u=in.nextInt();
		if(u<=100)
			amt=u*5.50;
		if((u>100)&&(u<=300))
			amt=100*5.50+(u-100)*6.50;
		if((u>300)&&(u<=300))
			amt=100*5.50+(u-100)*6.50;
		if((u>300)&&(u<=600))
			amt=100*5.50+200*6.50+(u-300)*7.50;
		if(u>600)
			amt=100*5.50+200*6.50+300*7.50+(u-600)*8.50;
		System.out.println("*******Money Receipt************");
		System.out.println("Customer's number:"+n);
		System.out.println("Consumer's name :"+name);
		System.out.println("Units consumed:"+u);
		System.out.println("Amount to be paid :Rs."+amt);
		
	}

}
