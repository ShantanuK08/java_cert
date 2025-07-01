package com.inheritance_Encapsulation;

class Salary extends Employee {
    double da, hra, pf, gross, net;

    void calculate() {
        da = 50.0 / 100.0 * basic;
        hra = 15.0 / 100.0 * basic;
        pf = 8.33 / 100.0 * (basic + da);
        gross = basic + da + hra;
        net = gross - pf;
    }

    void display() {
        System.out.println("\n--- Salary Details ---");
        System.out.println("Employee's Name: " + name);
        System.out.println("Basic Salary: Rs. " + basic);
        System.out.println("Dearness Allowance: Rs. " + da);
        System.out.println("House Rent Allowance: Rs. " + hra);
        System.out.println("Provident Fund: Rs. " + pf);
        System.out.println("Gross Salary: Rs. " + gross);
        System.out.println("Net Salary: Rs. " + net);
    }
}
