//To display the marks in descending order

package com.arrays;

import java.util.*;
public class ANumber {
	public static void main(String args[]) 
	{
		Scanner in=new Scanner(System.in);
		int i,j,t;
		int roll[]=new int[40];
		int marks[]= new int[40];
		System.out.println("Enter roll number and marks ");
		for(i=0;i<40;i++)
		{
				roll[i]=in.nextInt();
				marks[i]=in.nextInt();
			}
			for(i=0;i<39;i++)
			{
				for(j=0;j<39-i;j++)
				{
					if(marks[j]<marks[j+1])
					{
						t=roll[j];
						roll[j]=roll[j+1];
						roll[j+1]=t;
						t=marks[j];
						marks[j]=marks[j+1];
						marks[j+1]=t;
					}
				}
			}
			System.out.println("Roll No.\t"+"Marks");
			for(i=0;i<40;i++)
				System.out.println(roll[i]+"\t"+marks[i]);
		}
		
	}


