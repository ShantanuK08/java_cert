// To find the value of the given expression by using command line argument .abstract

//
//package com.basicprograms;
//
//public class Expression {
//	
//	public static void main(String args[])
//	{
//		int a,b;
//		double p;
//		//The values of a and b are entered through argument in String form
//		a=Integer.parseInt(args[0]);
//		b=Integer.parseInt(args[1]);
//		p=(double)(a * a + b * b )/( a - b );
//		System.out.println("The value of the expression =" +p);
//	}
//
//}
///


package com.basicprograms;

import java.util.Scanner;

public class Expression {

    public static void main(String args[]) {
        int a, b;
        double p;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        a = sc.nextInt();

        System.out.print("Enter value of b: ");
        b = sc.nextInt();

        if (a == b) {
            System.out.println("Denominator becomes zero. Division not possible.");
        } else {
            p = (double)(a * a + b * b) / (a - b);
            System.out.println("The value of the expression = " + p);
        }

        sc.close();
    }
}
