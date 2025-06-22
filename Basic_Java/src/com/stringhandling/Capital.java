package com.stringhandling;
import java.util.*;
public class Capital {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int i,a=0,k=0;
		String st;
		String m[]=new String[10];
		String n[]=new String[10];
		for(i=0;i<10;i++)
		{
			System.out.print("Enter states in the cell:");
			m[i]=in.nextLine();
			System.out.println("Enter capital in the cell:");
			n[i]=in.nextLine();
		}
		System.out.println("Enter the state whose capital is to be searched:");
		st=in.nextLine();
		for(i=0;i<10;i++)
		{
			if(m[i].equals(st))
			{
				k=1;
				a=i;
			}
		}
		if(k==1)
			System.out.println("The capital is"+n[a]);
		else 
			System.out.println("The state"+st+"is not found at any location");
	}

}
