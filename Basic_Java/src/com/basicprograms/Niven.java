// To check Niven number

package com.basicprograms;

import java.util.*;

class Niven {
public static void main(String args[]) {
	
	Scanner in = new Scanner(System.in);
	int num,sum=0,d,p;
	System.out.println("Enter a number");
	num = in.nextInt();
	p=num;
	do
	{
		d=num%10;
		sum=sum+d;
		num=num/10;
	}
	while(num!=0);
	if(p%sum==0)
		System.out.println("Niven number");
	else
		System.out.println("Not a Niven Number");
}

}
