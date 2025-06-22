//to display max and mini number in Single Dimensional Array

package com.arrays;
import java.util.*;
public class Max_Min {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int i,min,max;
		int m[]=new int[10];
		for(i=0;i<10;i++)
		{
			System.out.print("Enter the no. in the cell:");
			m[i]=in.nextInt();
		}
		max=m[0];min=m[0];
		for(i=0;i<10;i++)
		{
			if(m[i]>max)
				max=m[i];
			if(m[i]<min)
				min=m[i];
		}
		System.out.println("The greatest of the array elements="+max);
		System.out.println("The smallest of the array elements="+min);
	}

}
