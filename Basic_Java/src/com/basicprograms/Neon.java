package com.basicprograms;

public class Neon {
	public static void main(int n)
	{
		int p,s=0,d;
		p=n*n;
		do 
			{d=p%10;
			s=s+d;
			p=p/10;
			}
        while(p!=0);
		if(s==n)
			System.out.println("Neon number");
		else
			System.out.println("Not a Neon number");
		 
	
		
	}
}
