package com.stringhandling;
import java.util.*;
public class Pattern {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int a,b;
		String st;
		System.out.println("Enter the word in uppercase:");
		st=in.next();
		b=st.length();
		System.out.println("The pattern:");
		for(a=0;a<b;a++)
		{
			System.out.println(st.charAt(a));
		}
	}

}
