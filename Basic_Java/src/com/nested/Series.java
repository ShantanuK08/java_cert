package com.nested;
import java.util.*;

public class Series {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int a,b,n;
		double s=0;
		System.out.println("Enter the value of n");
		n=in.nextInt();
		for(a=1;a<=n;a++)
		{
			int f=1;
			for(b=1;b<=a;b++)
			{
				f=f*b;
			}
			s=s+(double)1/f;
		}
		System.out.println("The sum of the series ="+s);
	}

}
