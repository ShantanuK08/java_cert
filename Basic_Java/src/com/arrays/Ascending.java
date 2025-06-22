// To arrange the numbers by using Bubble Sort Technique

package com.arrays;
import java.util.*;
public class Ascending {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int i,j,t;
		int m[]=new int[10];
		for(i=0;i<10;i++)
		{
			System.out.print("Enter numbers in the cell:");
			m[i]=in.nextInt();
	
		}
		for(i=0;i<9;i++)
		{
			for(j=0;j<(9-i);j++)
			{
				if(m[j]>m[j+1])
				{
					t=m[j];
					m[j]=m[j+1];
					m[j+1]=t;
				}
			}
		}
		System.out.println("The numbers arranged in ascending order are:");
		for(i=0;i<10;i++)
			System.out.println(m[i]);
	}

}
