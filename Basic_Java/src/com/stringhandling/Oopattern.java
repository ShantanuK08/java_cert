package com.stringhandling;
import java.util.*;
public class Oopattern {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int a,b,p,k=0;
		String st;
		System.out.println("Enter any word to print in the pattern:");
		st=in.next();
		b=st.length();
		System.out.println("The Pattern:");
		for(a=b;a>=0;a--)
		{
			for(p=1;p<=k;a--)
			{
				System.out.print("");
			}
			System.out.println(st.substring(0,a));
			k++;
		}
		
	}

}
