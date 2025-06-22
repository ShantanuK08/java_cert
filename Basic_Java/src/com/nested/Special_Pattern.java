package com.nested;

public class Special_Pattern {
	public static void main(String args[])
	{
		int i,j,k,p,d;k=1;p=5;d=1;
		System.out.println("The pattern of Triangle:");
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=p;j++)
				System.out.println(j);
			for(k=1;k<=d;k++)
				System.out.println("");
			for(k=p;k>=1;k--)
				System.out.println();
			p=p-1;d=d+2;
		}
		
	}

}
