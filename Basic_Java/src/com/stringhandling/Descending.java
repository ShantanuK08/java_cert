package com.stringhandling;

import java.util.*;

public class Descending {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int i, j, min;
        String[] wd = new String[40];
        String t;

        System.out.println("Enter 40 different words:");

        for (i = 0; i < 40; i++) {
            System.out.print("Enter word " + (i + 1) + ": ");
            wd[i] = in.next();
        }

        // Selection sort in descending order
        for (i = 0; i < 39; i++) {
            min = i;
            for (j = i + 1; j < 40; j++) {
                if (wd[j].compareTo(wd[min]) > 0) {
                    min = j;
                }
            }
            t = wd[i];
            wd[i] = wd[min];
            wd[min] = t;
        }

        System.out.println("\nThe words arranged in descending order:");
        for (i = 0; i < 40; i++) {
            System.out.println(wd[i]);
        }

        in.close();
    }
}
