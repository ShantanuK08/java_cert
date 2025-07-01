package com.inheritance_Encapsulation;

import java.util.*;

public class Array {
    private int a[] = new int[10];
    private int b[] = new int[10];

    public void getlist() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 elements for array A:");
        for (int i = 0; i < 10; i++) {
            a[i] = in.nextInt();
        }

        System.out.println("Enter 10 elements for array B:");
        for (int i = 0; i < 10; i++) {
            b[i] = in.nextInt();
        }
    }

    int sum(int x, int y) {
        return x + y;
    }

    int max(int x, int y) {
        return (x > y) ? x : y;
    }

    void display() {
        for (int j = 0; j < 10; j++) {
            System.out.println("Pair " + (j + 1) + ": A = " + a[j] + ", B = " + b[j]);
            System.out.println("  Sum: " + sum(a[j], b[j]));
            System.out.println("  Max: " + max(a[j], b[j]));
        }
    }

    public static void main(String[] args) {
        Array obj = new Array();
        obj.getlist();
        obj.display();
    }
}
