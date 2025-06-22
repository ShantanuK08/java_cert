package com.basicprograms;

import java.util.*;

public class Menu {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int c,s,a,b,m,n,p;
		double k, area=0;
		System.out.println("1.Area of an Equilateral Triangle");
		System.out.println("2.Area of an Isoceles Triangle");
		System.out.println("3.Area of a Scalene Triangle");
		System.out.println("Enter your choice");
		c=in.nextInt();
		switch(c)
		{
		case 1:
			System.out.println("Enter side of an Equilateral triangle");
			s=in.nextInt();
			area= (Math.sqrt(3)*s*s)/4.0;
			System.out.println("Area="+area);
			break;
		case 2:
			System.out.println("Enter side of an Isosceles triangle");
			a=in.nextInt();
			b=in.nextInt();
			area = b * (Math.sqrt(4 * a * a - b * b)) / 4.0;
			System.out.println("Area=" + area);
			break;
		case 3:
			System.out.println("Enter side of an Scalene triangle");
			m=in.nextInt();
			n=in.nextInt();
			p=in.nextInt();
			k=(m+n+p)/2.0;
			area = Math.sqrt(k*(k-m)*(k-m)*(k-p));
			System.out.println("Area="+area);
			break;
		default:
			System.out.println("Wrong choice!!");
			
			
		}
	}

}
