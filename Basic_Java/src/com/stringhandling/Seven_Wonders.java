package com.stringhandling;
import java.util.*;
public class Seven_Wonders {
	public static void main(String args[])
	{
	
		Scanner in=new Scanner(System.in);
		String wond[]=new String[7];
		String locn[]=new String[7];
		int i,f=0;
		String cty;
		System.out.println("Enter seven wonders:");
		for(i=0;i<7;i++)
		{
			wond[i]=in.next();
		}
		System.out.println("Eneter locations of seven wonders:");
		for(i=0;i<7;i++)
		{
			locn[i]=in.next();
		}
		System.out.println("Enter a country name to be searched:");
		cty=in.next();
		f=0;
		for(i=0;i<7;i++)
			for(i=0;i<7;i++)
			{
				if(cty.equals(locn[i]))
				{
					f=1;
					break;
				}
			}
		if(f==1)
		{
			System.out.println("Search successful");
			System.out.println(locn[i]+ ":\tWonders:\t+wond[i]");
		}
		else
			System.out.println("Search unsuccessful, no such location is found in the list");
	}

}
