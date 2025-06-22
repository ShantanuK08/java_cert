//To display the sum of the numbers which are divisible by 3 or 5

package com.arrays;
import java.util.*;
public class Sum {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int i,s=0;
		int m[]=new int[20];
		for(i=0;i<20;i++)
		{
			System.out.print("Enter the number in cell ;");
			m[i]=in.nextInt();
		}
		for(i=0;i<20;i++)
		{
			if(m[i]%3==0 || m[i]%5==0)
				s=s+m[i];
			
		}
		System.out.println("The sum of numbers divisible by 3 or 5:"+s);
		
	}

}
