package com.basicprograms;
import java.util.*;
public class Numbers {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n1,n2;
		String s;
		System.out.println("Enter first number");
		n1=in.nextInt();
		System.out.println("Enter second number");
		n2=in.nextInt();
		s=Integer.toString(n1)+Integer.toString(n2);
		System.out.println("Number after joining\t"+s);
	}
}
