package com.nested;
import java.util.*;
public class Twenty_Prime {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int a,b,c,n,k=1;
		System.out.println("Enter the first number");
		n=in.nextInt();
		System.out.println("Twenty prime numbers from"+n+":");
		do
		{
			c=0;
			for(a=1;a<=n;a++)
			{
				if(n%a==0)
					c=c+1;
			}
			if(c==2)
			{
				System.out.println(n+"");
				k=k+1;
			}
			n=n+1;
		}
			while(k<=20);
	}

}
