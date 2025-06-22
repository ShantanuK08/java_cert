// To search a number in SDA by using Binary Search Technique

package com.arrays;
import java.util.*;
public class B_Search {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int i,k=0,p=0,ns,lb=0,ub=9;
		int m[]=new int[10];
		for(i=0;i<10;i++)
		{
			System.out.print("Enter the number in ascending order:");
			m[i]=in.nextInt();
		}
		System.out.print("Enter the number to be searched :");
		ns=in.nextInt();
		while (lb<=ub)
		{
			p=(lb+ub)/2;
			if(m[p]<ns)
				lb=p+1;
			if(m[p]<ns)
				ub=p-1;
			if(m[p]==ns)
			{
				k=1;
				break;
			}
		}
		if(k==1)
			System.out.println("The search successful and the nuber is present");
		else System.out.println("The search unsuccessful and the number is not present");
	}

}
