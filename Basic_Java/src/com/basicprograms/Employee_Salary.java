// Program to calculate employee salary ,employee's gross and net salary by using scanner class 



package com.basicprograms;

import java.util.*;

public class Employee_Salary {
	
	public static void main(String args[])
	
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter employee's name and basic salary");
		double basic,da,hra,pf,gp = 0,np=0;
		String empn;
		empn = in.nextLine();
		basic = in.nextInt();
		da = basic*25.0/100.0;
		hra=basic*15.0/100.0;
		pf=basic*8.33/100.0;
		gp=basic+da+hra;
		np=gp-pf;
		System.out.println("Name of the employee =" +empn);
		System.out.println("Gross Pay =Rs."+gp);
		System.out.println("Net Pay =Rs."+np);
		
		
	}

}
