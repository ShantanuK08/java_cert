package com.nested;

public class APattern {
	public static void main(String args[])
	{
		int a,b,c,p=2;
		System.out.println("The Pattern:");
		for(a=1;a<=5;a++)
		{
			for(b=1;b<=a;b++)
				System.out.print(a);
			for(c=p;c<=5;c++)
				System.out.println(c);
			System.out.println();
			p=p+1;
		}
	}

}
