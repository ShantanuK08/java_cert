// A program to show the use of different mathematical functions 

package com.basicprograms;

public class Math_Functions {
	public static void main(String args[])
	{
		double m=6.25,n=8.75,p=15.625;
		System.out.println("Theoutput of different mathematical functions are:");
		System.out.println("Minimun value between 6.25 & 8.75 = " +Math.min(m, n));
		System.out.println("Maximum value between 6.25 & 8.75 = "+Math.max(m, n));
		System.out.println("Square root of 6.25 = " +Math.sqrt(m));
		System.out.println("Cube root of 15.625 = " +Math.cbrt(p));
		System.out.println("6.25 raised to the power 3 = " +Math.pow(m,3));
		System.out.println("Absolute value of (6.25 - 8.75) = " +Math.abs(m - n));
		System.out.println("The floor value of 6.25 = " +Math.floor(m));
		System.out.println("The ceil value of 6.25 = " +Math.ceil(m));
		System.out.println("Integral value  of 6.25 = " +Math.rint(m));
		System.out.println("Rounded value  of 6.25 = " +Math.round(m));
		System.out.println("Exponent value  of 6.25 = " +Math.exp(m));
		System.out.println("SNatural log of 6.25 = " +Math.log(m));
		
		
	}

}
