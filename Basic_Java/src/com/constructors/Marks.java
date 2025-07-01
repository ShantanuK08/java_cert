package com.constructors;
import java.util.*;

public class Marks {
    String name;
    int age, m1, m2, m3, max;
    double avg;

   
    Marks(String n, int d, int a, int b, int c) {
        name = n;
        age = d;
        m1 = a;
        m2 = b;
        m3 = c;
    }

    
    void compute() {
        avg = (m1 + m2 + m3) / 3.0; 
        max = m1;
        if (m2 > max) max = m2;
        if (m3 > max) max = m3;
    }

    
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Average Marks: " + avg);
        System.out.println("Maximum Marks: " + max);
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String n = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter 3 marks: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Marks obj = new Marks(n, age, a, b, c);
        obj.compute();
        obj.display();
    }
}
