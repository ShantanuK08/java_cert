//To display the maximum and minimum temp of the day

package com.arrays;
import java.io.*;
public class dd_temp {
	public static void main(String args[])throws IOException
	{
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		int i,j;
		String day;
		String m[][]=new String[7][3];
		for(i=0;i<7;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println("Enter day,maximum temp,minimum temp:");
				m[i][j]=in.readLine();
			}
		}
		System.out.println("Enter day of the week to know the temperature");
		day=(in.readLine());
		for(i=0;i<7;i++)
		{
			if(day.compareTo(m[i][0])==0)
			{
				System.out.println("The maximum temperature of "+day+"is"+m[i][1]);
				System.out.println("The minimum temperature of "+day+"is"+m[i][2]);
				
			}
		}
		
	}

}
