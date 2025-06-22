//To Display teh no. of students with a aggregate marks

package com.arrays;
import java.util.*;
public class Average {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int i,j,c1=0,c2=0;
		int phy[]=new int[40];
		int chem[]=new int[40];
		int maths[]=new int[40];
		for (i=0;i<40;i++)
		{
			System.out.println("Marks secured in Physics");
			phy[i]=in.nextInt();
			System.out.println("Marks secured in Chemistry");
			chem[i]=in.nextInt();
			System.out.println("Marks secured in maths");
			maths[i]=in.nextInt();
			
		}
		for(i=0;i<40;i++)
		{
			if((phy[i]+chem[i]+maths[i])/3.0>=80)
				c1++;
			if((phy[i]+chem[i]+maths[i])/3.0>=34)
				c2++;
		}
		System.out.println("Number of students getting 80% and above\t"+c1);
		System.out.println("Number of students getting 34% and below\t"+c2);
	}

}
