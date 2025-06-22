package com.nested;

public class OPattern {
	public static void main(String args[])
	{
		int i,j;
		System.out.println("The Pattern");
		for(i=7;i>=1;i=i-2)
		{
			for(j=1;j<=i;j++);
			System.out.print(j+"");
			System.out.println();
		}
	}

}
