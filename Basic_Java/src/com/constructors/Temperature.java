package com.constructors;
import java.util.*;

class Temperature {
	double max, min, f1, f2;

	Temperature(double m, double n) {
		max = m;
		min = n;
	}

	void compute() {
		f1 = 9 * max / 5 + 32;
		f2 = 9 * min / 5 + 32;
	}

	void display() {
		System.out.println("The maximum temperature in Fahrenheit: " + f1);
		System.out.println("The minimum temperature in Fahrenheit: " + f2);
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double t1, t2;
		System.out.println("Enter maximum and minimum temperature in Celsius:");
		t1 = in.nextDouble();
		t2 = in.nextDouble();
		Temperature ob = new Temperature(t1, t2);
		ob.compute();
		ob.display();
	}
}
