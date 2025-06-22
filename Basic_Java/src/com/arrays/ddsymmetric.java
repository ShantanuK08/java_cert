// To check whether a matrix is symmetric or not 

package com.arrays;
import java.util.*;
public class ddsymmetric {
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		int i,k,j;k=0;
		int m[][]=new int [3][3];
		int n[][]=new int [3][3];
		System.out.println("Enter the numbers of the matrix:");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				m [i][j]=in.nextInt();
		}
		System.out.println("The numbers of the matrix are :");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(m[i][j]+"");
			}
			System.out.println();
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{if(m[i][j]!=m[j][i])
				k=1;
			}
		}
		if(k==0)
			System.out.println("It is a symmetric matrix");
		else
			System.out.println("It is not a Symmetric Matrix");
	}

}
