package com.stringhandling;
import java.util.*;
public class Replace {
	public static void main(String args[])
	{
		int a,p;
		String st;
		char chr;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a string:");
		st=in.nextLine();
		p=st.length();
		System.out.println("The Output:");
		for(a=0;a<p;a++)
		{
			chr=st.charAt(a);
			{
				if(chr=='e')
					chr='*';
			}
			System.out.print(chr);
		}
		System.out.println();
	}

}
