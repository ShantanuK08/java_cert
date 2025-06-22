package com.arrays;

import java.util.Scanner;

public class ddMax_Min {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int i,j,min,max;
		min=0;max=0;
		int m[][]=new int[4][4];
		System.out.println("Enter the numbers of the matrix");
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
				m[i][j]=in.nextInt();
		}
		System.out.print("The numbers of the matrix are:");
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.print(m[i][j]+"");
			}
			System.out.println();
		}
		min=m[0][0];
		max=m[0][0];
		for(i=0;i<4;i++)
		{
			for(j=0;j<4;j++)
			{
				if(min>m[i][j])
					min=m[i][j];
				if(max<m[i][j])
					max=m[i][j];
			}
		}
		System.out.println("the lowest number in the array is"+min);
		System.out.println("The highest number in the array is" +max);
	}

}
