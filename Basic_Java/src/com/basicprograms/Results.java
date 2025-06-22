// To display output of different mathematical functions

package com.basicprograms;

import java.util.*;

public class Results {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int a,i;
		System.out.println("Enter a number");
		a = in.nextInt();
		System.out.println("The output of different Mathematical functions:");
		System.out.println("Natural log of "+a +"="+Math.log(a));
		System.out.println("Absolute value of "+a+"="+Math.abs(a));
		System.out.println("Square root of"+a+"="+Math.sqrt(a));
		System.out.println("Cube of "+a+"=" +(a*a*a));
		System.out.println("Random Numbers between 0 and 1 are:");
		System.out.println(Math.random());
	}

}
