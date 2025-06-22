package com.stringhandling;
import java.util.*;
public class Special {
	public static void main(String args[])
	{
		Scanner in= new Scanner(System.in);
		int a,p,up=0,lc=0,d=0,spl=0;
		String st;
		char chr;
		System.out.println("Enter your string:");
		st=in.nextLine();
		p=st.length();
		for(a=0;a<p;a++)
		{
			chr=st.charAt(a);
			if(chr>='a'&&chr<='z')
				lc = lc + 1;
			else if(chr>='A'&&chr<='Z')
				up=up+1;
			else if(chr>'0'&&chr<='9')
				d=d+1;
			else
				spl=spl+1;
		}
		System.out.println("The Output:");
		System.out.println("The number of lowercase characters:"+lc);
		System.out.println("The number of uppercase charaters:"+up);
		System.out.println("The number of special characters:"+spl);
		System.out.println("The number of digits present in the string:"+d);
		
	}

}
