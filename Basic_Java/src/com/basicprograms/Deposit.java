package com.basicprograms;
import java.util.*;
public class Deposit {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		double p,r,a;
		int n,ch;
		System.out.println("Menu List");
		System.out.println("1.Term Deposit");
		System.out.println("2.Recurring Deposit");
		System.out.println("Enter your choice");
		ch=in.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter Principal,Rate and Time");
			p=in.nextDouble();
			r=in.nextDouble();
			n=in.nextInt();
			a=p*Math.pow((1+r/100.0),n);
			System.out.println("Amount under term deposit = Rs."+a);
			break;
		case 2:
			System.out.println("Enter Principal,Rate and Time");
			p=in.nextDouble();
			r=in.nextDouble();
			n=in.nextInt();
			a=p*n+p*(n * (n+1))/2.0 * r/100.0 * 1.0/12.0;
			System.out.println("Amount under recurring deposit=Rs."+a);
			break;
			default:
				System.out.println("Invalid Choice");
		}
	}

}
