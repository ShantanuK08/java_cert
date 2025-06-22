package com.stringhandling;
import java.util.*;
public class Unique_String {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String str;
		int i,j,p,k=1;
		System.out.println("Enter a word:");
		str=in.next();
		str=str.toUpperCase();
		p=str.length();
		for(i=0;i<p;i++)
		{
			for(j=i+1;j<p;j++)
				if(str.charAt(i)==str.charAt(j))
					k=0;
			
		}
		if(k==1)
			System.out.println(str+"is a Unique String");
		else
			System.out.println(str="is not a Unique String");
	}

}
