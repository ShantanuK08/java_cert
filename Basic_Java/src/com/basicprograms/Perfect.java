
package com.basicprograms;

import java.util.*;
public class Perfect {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int a,n,s=0;
		System.out.println("Enter a number");
		n=in.nextInt();
		for(a=1;a<n;a++)
		{
			if(n%a==0)
				s=s+a;
		}
		if(s==n)
			System.out.println( a +" is a perfect number");
		else
			System.out.println( a +" is not a perfect number");
			
	}

}
