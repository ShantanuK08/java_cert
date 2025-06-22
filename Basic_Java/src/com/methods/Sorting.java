package com.methods;
import java.util.*;
public class Sorting {
	void sort(int m[])
	{
		int i,j,t;
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
		System.out.println("The numbers are arranged in ascending order as");
		for(i=0;i<10;i++)
			System.out.println(m[i]);
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		Sorting ob=new Sorting();
		int i;
		int n[]=new int[10];
		for(i=0;i<10;i++)
		{
			System.out.println("Enter your marks in the cell" +(i+1)+":");
			n[i]=in.nextInt();
		}
		ob.sort(n);
	}

}
