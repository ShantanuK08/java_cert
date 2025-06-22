//To find the difference betweeen Compound Interest and simple Interest 

package com.basicprograms;

public class Difference {
	public static void calculateInterestDifference(int p, int r,int t)
	{
		double si,ci=0,amt,diff =0;
		si=p*r*t/100.0;
		amt=p*(Math.pow(1+r/100.0, t));
		ci=amt-p;
		diff = ci-si;
		System.out.println("The Compound Interest =Rs."+(float)ci);
		System.out.println("The Simple Interest =Rs." +si);
		System.out.println("The difference between CI and Si =Rs."+(float)diff);
	}
	
	public static void main(String[]args) {
		
		int p = 10000;
		int r = 10;
		int t = 2;
		
		 calculateInterestDifference(p, r, t);
			
	}

}
