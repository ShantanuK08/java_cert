package com.basicprograms;
import java.util.*;
public class ONumber {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n,ch,c,i,min,r;
		System.out.println("1. To check a composite number");
		System.out.println("2. To find the smallest digit of an integer");
		System.out.println("Enter your choice!");
		ch = in.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter a number to check whether it is a composite or not");
			n=in.nextInt();
			c=0;
			for(i=2;i<n;i++)
				if(n%i==0)
					c=c+1;
			if(c>=1)
				System.out.println("It is composite number.");
			else
				System.out.println("It is not a composite numvber.");
			break;
		case 2:
			System.out.println("Enter a number to find the smallest digit");
			n=in.nextInt();
			min=n%10;
			while(n>0)
			{
				r=n%10;
				if(r<min)
				min=r;
			n=n/10;
			}
			System.out.println("The smallest digit is:\t"+min);
			break;
			default:
				System.out.println("Invalid Choice!");
		}
	}

}
