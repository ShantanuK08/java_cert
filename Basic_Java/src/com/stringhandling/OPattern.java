package com.stringhandling;
import java.util.*;
public class OPattern {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int a,b;
		String st;
		System.out.println("Enter the word to print in a pattern:");
		st=in.next();
		b=st.length();
		System.out.println("The Pattern:");
		for(a=1;a<=b;a++)
		{
			System.out.println(st.substring(0,a));
		}
	}

}
