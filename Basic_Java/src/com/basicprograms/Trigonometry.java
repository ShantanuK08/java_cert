// To implement trigonometric functions

package com.basicprograms;

public class Trigonometry {
	
	public static void main(String args[]) {
		
		double m=30,n=60,p=45;
		double x,y,z;
		//Convert angles in radians
		
		x=(22.0/(7.0*180.0))*m;
		y=(22.0/(7.0*180.0))*n;
		z=(22.0/(7.0*180.0))*p;
		System.out.println("The Trigonometrical values are:");
		System.out.println("The value of sin 30 degree =" + Math.sin(x));
		System.out.println("The value of tan 45 degree ="+Math.tan(z));
		
	}

	
}
