package com.nested;
import java.util.*;
public class Special {
	public static void main(String args[])
	{
		int m,n,i,d,f=1,s=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number:");
		n=in.nextInt();
		m=n;
		while(m!=0)
		{
			d=m%10;
			for(i=1;i<=d;i++)
				f=f*i;
			s=s+f;
			f=1;
			m=m/10;
		}
		if(s==n)
		{
			System.out.println("The sum of factorial of digits ="+s);
			System.out.println(n+"is a special number");
		}
		else
		{
			System.out.println("The sum of factorial of digits ="+s);
			System.out.println(n+"is not a special numkber");
		}
	}

}
