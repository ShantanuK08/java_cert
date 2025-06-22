// To display number of even,odd and multiples of 4

package com.arrays;
import java.util.*;
public class Number {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int i,j,c1=0,c2=0,c3=0;
		int a[]=new int[20];
		System.out.println("Enter 20 numbers");
		for(i=0;i<20;i++)
			a[i]=in.nextInt();
		for(i=0;i<20;i++)
		{
			if(a[i]%2==0)
				c1++;
			if(a[i]%2 != 0)
				c2++;
			if(a[i]%4 ==0)
				c3++;
		}
		System.out.println("Number of even numbers\t"+c1);
		System.out.println("Number of odd numbers\t"+c2);
		System.out.println("Number of multiples of 4\t"+c3);
	}

}
