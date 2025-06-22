// To find transpose of a matrix

package com.arrays;
import java.util.*;

public class ddtranspose {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int i, j;
        int m[][] = new int[4][4];
        int n[][] = new int[4][4];

        System.out.println("Enter the numbers of the matrix:");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                m[i][j] = in.nextInt();
            }
        }

        System.out.println("The matrix is:");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

        
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                n[j][i] = m[i][j];
            }
        }

        System.out.println("The transpose of the matrix is:");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(n[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
