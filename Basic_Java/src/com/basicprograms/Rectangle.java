
//program to calculate area of rectangle using class and function 

package com.basicprograms;

import java.util.Scanner;

public class Rectangle {
	int l,b,ar;
	public void Input()
	{
		Scanner in = new Scanner (System.in);
		System.out.println("Enter length of Rectengle :");
		l=in.nextInt();
		System.out.println("Enter breadth of Rectangle:");
		b=in.nextInt();
		
	}
	
	public void Calculate()
		{
		ar=l*b;
		}
	
	public void Display()
	{
	System.out.println("Length of rectangle = " +l);
	System.out.println("Breadth of rectangle = "+b);
	System.out.println("Area of rectangle ="+ar);
	}
	public static void main(String args[])
	{
		Rectangle ob=new Rectangle();
		ob.Input();
		ob.Calculate();
		ob.Display();
	
	}
	
}
