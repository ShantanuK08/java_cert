package com.stringhandling;
import java.util.*;
public class Vowel {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int a,b,v=0;
		String st;
		char chr;
		System.out.println("Enter your string:");
		st=in.nextLine();
		b=st.length();
		for(a=0;a<b;a++)
		{
			chr=st.charAt(a);
			if(chr=='a'||chr=='i'||chr=='o'||chr=='u'||chr=='A'||chr=='E'||chr=='I'||chr=='O'||chr=='U')
				v=v+1;
		}
		System.out.println("the number of vowels in the string:"+v);
	}

}
