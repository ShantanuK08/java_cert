package com.constructors;
import java.util.*;

public class Employee_Sal {
	String name, empno;
	int basic;
	double da, hra, pf, gs, net;

	
	Employee_Sal(String n, String en, int bs) {
		name = n;
		empno = en;
		basic = bs;
	}

	void compute() {
		da = basic * 30.0 / 100.0;
		hra = basic * 15.0 / 100.0;
		pf = basic * 12.0 / 100.0;
		gs = basic + da + hra;
		net = gs - pf;
	}

	void display() {
		System.out.println("Name: " + name);
		System.out.println("Employee Number: " + empno);
		System.out.println("Gross Salary: Rs. " + gs);
		System.out.println("Net Salary: Rs. " + net);
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String nm, enm;
		int bsal;

		System.out.println("Enter Employee's Name:");
		nm = in.nextLine();
		System.out.println("Enter Employee Number:");
		enm = in.nextLine();
		System.out.println("Enter Basic Salary:");
		bsal = in.nextInt();

		Employee_Sal ob = new Employee_Sal(nm, enm, bsal);
		ob.compute();
		ob.display();
	}
}
