// To display the sum of the matrix elements

package com.arrays;
import java.util.*;

public class ddsum {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int i, j, s;
        s = 0;
        int m[][] = new int[3][4];

        System.out.println("Enter the numbers of the matrix:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                m[i][j] = in.nextInt();
            }
        }

        System.out.println("The numbers of the matrix are:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(m[i][j] + "\t");
                s += m[i][j]; 
            }
            System.out.println();
        }

        System.out.println("Sum of all matrix elements: " + s);
    }
}
