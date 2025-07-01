package com.inheritance_Encapsulation;

import java.util.*;

class Employee {
    String name;
    float basic;

    void getdata() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Employee's name:");
        name = in.nextLine();
        System.out.println("Enter Employee's basic salary:");
        basic = in.nextFloat();
    }

    public static void main(String[] args) {
        Salary s = new Salary();
        s.getdata();
        s.calculate();
        s.display();
    }
}
