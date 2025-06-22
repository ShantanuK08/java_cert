package com.methods;

import java.util.*; 

public class Palin {
	int reverse(int n) {
		int d, r = 0;
		do {
			d = n % 10;
			r = r * 10 + d;
			n = n / 10;
		} while (n != 0);
		return (r);
	}

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int a, c, k;                          
		Palin ob = new Palin();            

		System.out.println("Enter your number");
		a = in.nextInt();
		c = a;
		k = ob.reverse(a);                  

		if (k == c)
			System.out.println("The number " + c + " is a palindrome");
		else
			System.out.println("The number " + c + " is not a palindrome");

		in.close(); 
	}
}
