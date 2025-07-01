package com.Object_class;
import java.util.*;

public class Array_Maxmin {
    int[] m = new int[10];
    int min, max;

    void input() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the number in cell " + i + ": ");
            m[i] = in.nextInt();
        }
        min = m[0];
        max = m[0];
    }

    void findMax() {
        for (int i = 0; i < 10; i++) {
            if (m[i] > max)
                max = m[i];
        }
    }

    void findMin() {
        for (int i = 0; i < 10; i++) {
            if (m[i] < min)
                min = m[i];
        }
    }

    void display() {
        System.out.println("The greatest of the array elements = " + max);
        System.out.println("The smallest of the array elements = " + min);
    }

    public static void main(String[] args) {
        Array_Maxmin obj = new Array_Maxmin();
        obj.input();
        obj.findMax();
        obj.findMin();
        obj.display();
    }
}
