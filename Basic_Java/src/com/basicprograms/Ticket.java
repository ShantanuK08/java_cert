package com.basicprograms;
import java.util.*;
public class Ticket {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		{
			int i,p;
			double d=0,amt=0;
			String name;
			for(i=1;i<=15;i++)
			{
				System.out.println("Enter name of the customer:");
				name=in.nextLine();
				System.out.println("Enter the amount of the tickect:");
				p=in.nextInt();
				if(p<25001)
					d=p*2.0/100.0;
				if(p>25001&&p<=35000)
					d=p*10.0/100.0;
				if(p>35001&&p<=55000)
					d=p*16.0/100.0;
				if(p>70000)
					d=p*18.0/100.0;
				amt=(p-d);
				System.out.println("S.No.\tName\t\tTickect Charge\t\tTickect Charge\t\tDiscount\tNetAmount");
				System.out.println(i+"\t"+name+"\t\t"+p+"\t\t"+d+"\t\t"+amt);
			}
		}
	}
	

}
