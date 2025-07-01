package com.Object_class;
import java.util.Scanner;

public class Array_sort {
    int i, j, t;
    int m[] = new int[10];

    void input() {
        Scanner in = new Scanner(System.in);
        for (i = 0; i < 10; i++) {
            System.out.print("Enter number in cell " + i + ": ");
            m[i] = in.nextInt();
        }
    }

    void arrange() {
        // Bubble sort
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9 - i; j++) {
                if (m[j] > m[j + 1]) {
                    t = m[j];
                    m[j] = m[j + 1];
                    m[j + 1] = t;
                }
            }
        }
    }

    void display() {
        System.out.println("\nNumbers arranged in ascending order:");
        for (i = 0; i < 10; i++) {
            System.out.println(m[i]);
        }
    }

    public static void main(String[] args) {
        Array_sort obj = new Array_sort();
        obj.input();
        obj.arrange();
        obj.display();
    }
}
