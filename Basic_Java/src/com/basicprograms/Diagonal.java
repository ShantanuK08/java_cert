// To find the diagonal of cuboid

package com.basicprograms;

 import java.util.*;
 
public class Diagonal {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int l,b,h;
		double d;
		System.out.println("Enter length,breadth and heigth of a cuboid");
		l=in.nextInt();
		b=in.nextInt();
		h=in.nextInt();
		d=Math.sqrt(l * l + b * b + h * h);
		System.out.println("Diagonal of a cuboid ="+d);
	}
	

}
