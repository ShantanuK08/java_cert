package com.basicprograms;
import java.util.*;
public class Armstrong {
	public static void checkArmstrong(int n)
	{
		int a,num,s=0;
		num=n;
		while(n>0)
		{
			a=n%10;
			s=s+a*a*a;
			n=n/10;
		}
		if(num==s)
			System.out.println("The number"+num+"is an Armstrong Number");
		else
			System.out.println("The number"+num+"is not a Armstrong Number");
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        checkArmstrong(input);
        sc.close();
	    }
}
