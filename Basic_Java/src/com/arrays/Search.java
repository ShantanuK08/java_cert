package com.arrays;
import java.util.*;
public class Search {
	public static void main(String args[]){
		Scanner in= new Scanner(System.in);
		int i,k=0,ns;
		int m[]=new int[10];
		for(i=0;i<10;i++)
		{
			System.out.print("Enter the number in the cell:");
			m[i]=in.nextInt();
		}
		System.out.print("Enter the number to be searched:");
		ns=in.nextInt();
		for(i=0;i<10;i++)
		{
			if(m[i]==ns)
				k=1;
		}
		if(k==1)
			System.out.println("The number is present");
		else
			System.out.println("The number is not present.");
		
		
	}

}
