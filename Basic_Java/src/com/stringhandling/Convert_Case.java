package com.stringhandling;
import java.util.*;
public class Convert_Case {
	public static void main(String args[])
	{
		Scanner in= new Scanner(System.in);
		int a,i,p;
		String st,st1="";
		char chr,chr1;
		System.out.println("Enter your String:");
		st=in.nextLine();
		p=st.length();
		for(a=0;a<p;a++)
		{
			chr=st.charAt(a);
			if(chr>='a'&&chr<='z')
			{
				chr1=Character.toUpperCase(chr);
				st1=st1+chr1;
			}
			else if(chr>='A'&&chr<='Z')
			{
				chr1=Character.toLowerCase(chr);
				st1=st1+chr1;
			}
			else
				st1=st1+chr;
		}
		System.out.println("The new string after converting the case of each letter :");
		System.out.println(st1);
		
	}

}
