package com.stringhandling;
import java.io.*;
public class Name_Telephone {
	public static void main(String[]args) throws IOException
	{
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in= new BufferedReader(read);
		int i,a=0,k=0;
		String name,b="";
		String m[]=new String[20];
		long n[]=new long[20];
		for(i=0;i<20;i++)
		{
			System.out.println("Enter name one by one:");
			m[i]=in.readLine();
			System.out.print("Enter corresponding telephoone number one by one:");
			n[i]=Long.parseLong(in.readLine());
		}
		System.out.println("Enter the name to be searched");
		name=in.readLine();
		for(i=0;i<20;i++)
		{
			if(m[i].equals(name))
			{
				k=1;a=i;b=m[i];
			}
		}
		if(k==1)
			System.out.println("The name is"+b+"and the telephone number is"+n[a]);
		else
			System.out.println(name+"is not found at any location");
		
		
	}

}
