package com.nested;

public class SPattern {
	public static void main(String args[]) {
		int a,b,c,d,p,k;p=65;k=5;
		System.out.println("The pattern:");
		for(a=1;a<=5;a++)
		{
			for(b=1;b<=a;b++)
				System.out.print(a+"");
			for(c=k;c>=1;c--)
			{
				System.out.print((char)p+"");
			}
			k=k-1;
			p=p+1;
			System.out.println();
		}
	}

}
