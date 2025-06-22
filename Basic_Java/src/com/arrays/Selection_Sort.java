// To arrange the numbers by using Selection Sort Technique

package com.arrays;

import java.util.Scanner;

public class Selection_Sort {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int i,j,t,min;
		int m[]=new int[10];
		for (i=0;i<10;i++)
		{
			System.out.print("Enter the number in the cell:");
			m[i]=in.nextInt();
		}
		for(i=0;i<9;i++)
		{
			min=i;
			for(j=i+1;j<10;j++)
			{
				if(m[j]<m[min])
					min=j;
			}
			t=m[i];
			m[i]=m[min];
			m[min]=t;
		}
		System.out.println("The numbers arranged in ascending order are:");
		for(i=0;i<10;i++)
			System.out.println(m[i]);
	}

}
