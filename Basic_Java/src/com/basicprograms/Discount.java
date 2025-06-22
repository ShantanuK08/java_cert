package com.basicprograms;
import java.util.*;
public class Discount {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int p;
		double d=0,amt=0;
		System.out.println("Enter the amount of purchase");
		p=in.nextInt();
		if(p<=2000)
		{
			d=p*5.0/100.0;
			System.out.println("Gift: Wall Clock");
		}
		if(p>=2001&&p<=5000)
		{
			d=p*10.0/100.0;
			System.out.println("Gift:School Bag");
		}
		if(p>=5001&&p<=10000)
		{
			d=p*15.0/100.0;
			System.out.println("Gift:Electric Iron");
		}
		if(p>10000)
		{
			d=p*20.0/100.0;
			System.out.println("Gift:Wrist Watch");
		}
		amt=p-d;
		System.out.println("Amount of purchase :Rs."+p);
		System.out.println("Discount:Rs."+d);
		System.out.println("Amount to be paid :Rs."+amt);
		
	}

}
