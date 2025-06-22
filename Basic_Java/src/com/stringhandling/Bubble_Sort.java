
package com.stringhandling;
import java.util.*;
public class Bubble_Sort {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String ct[]=new String[10];
		String t="";
		int i,j;
		System.out.println("Enter array elements");
		for(i=0;i<10;i++)
			ct[i]=in.next();
		{
		for(j=0;j<(9-i);j++)
		{
			if(ct[j].compareTo(ct[j+1])>0)
			{
				t=ct[j];
				ct[j]=ct[j+1];
				ct[j+1]=t;
			}
		}
	}
		System.out.println("The city names arranged in ascending order:");
		for(i=0;i<10;i++)
			System.out.println(ct[i]);
	}
}
