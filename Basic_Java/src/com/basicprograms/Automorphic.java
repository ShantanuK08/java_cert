package com.basicprograms;
import java.util.*;
public class Automorphic {
	public static void checkAutomorphic(int num)
	{
		int p,f=0;
		p=num*num;
		do
		{
			if(num%10!=p%10)
			{
				f=1;
				break;
			}
			else
			{
				num=num/10;
				p=p/10;
			}
		}
		while(num>0);
		if(f==0)
			System.out.println("Automorphic Number");
		else
			System.out.println("Not an Automorphic Number");
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int input= sc.nextInt();
		checkAutomorphic(input);
		sc.close();
				
		
	}

}
