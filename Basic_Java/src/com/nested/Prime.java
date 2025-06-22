package com.nested;

public class Prime {
	public static void main(String args[]) {
		int a,b;
		System.out.println("The prime numbers between 1 to 100 are:");
		for (a=1;a<=100;a++)
		{
			int c=0;
			for(b=1;b<=a;b++)
			{
				if(a%b==0)c=c+1;
			}
			if(c==2)
				System.out.println(a);
		}
	}

}
