package com.basicprograms;
import java.util.*;

public class Income_Tax {
    public static void main(String args[]) {
        int age, ti;
        char g;
        double tax = 0.0;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter gender 'M' for male, 'F' for female:");
        g = in.next().charAt(0);

        System.out.println("Enter age of the person:");
        age = in.nextInt();

        System.out.println("Enter taxable income:");
        ti = in.nextInt();

        if (age <= 65 && g == 'M')
        {
            if (ti < 250000)
                tax = 0.0;
             if (ti >= 250000 && ti < 500000)
                tax = (ti - 250000) * 10.0 / 100.0;
             if (ti >= 500000 && ti <= 1000000)
                tax = ((ti - 500000) * 20.0 / 100.0) + 25000.0;
             if (ti > 1000000)
                tax = ((ti - 1000000) * 30.0 / 100.0) + 125000.0;

            System.out.println("***** Details of the Tax Payer *****");
            System.out.println("Gender of the tax payer: " + g);
            System.out.println("Age: " + age);
            System.out.println("Taxable Income = Rs. " + ti);
            System.out.println("Income Tax = Rs. " + tax);
        }
        else {
            System.out.println("Wrong category!!");
            System.out.println("No calculation of Income Tax");
        }
    }
}
