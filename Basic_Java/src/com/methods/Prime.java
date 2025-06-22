package com.methods;
import java.util.*;
public class Prime {
	int check(int n)
	{
		int i,c=0,f=0;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
				c=c+1;
		}
		if(c==2)
			f=1;
		return(f);
	}
	public static void main(String args[])
	{
		int a,k;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your number");
		a=in.nextInt();
		Prime ob=new Prime();
		k=ob.check(a);
		if(k==1)
			System.out.println(a+"is a prime number");
		else
			System.out.println(a+"is not a prime number");
		
	}

}
