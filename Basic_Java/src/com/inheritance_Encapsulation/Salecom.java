package com.inheritance_Encapsulation;

import java.util.Scanner;

public class Salecom {
    private double sale, com;

    Salecom(double s, double c) {
        sale = s;
        com = c;
    }

    void commission() {
        if (sale <= 1000)
            com = 5.0 / 100.0 * sale;
        else if (sale <= 2000)
            com = 10.0 / 100.0 * sale;
        else
            com = 15.0 / 100.0 * sale;
    }

    void display() {
        System.out.println("Sale value: " + sale);
        System.out.println("Commission to the salesman: " + com);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total sale amount: ");
        double saleAmount = sc.nextDouble();

        Salecom obj = new Salecom(saleAmount, 0);
        obj.commission();
        obj.display();

        sc.close();
    }
}
