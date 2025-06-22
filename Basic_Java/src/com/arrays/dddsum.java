// To find the sum of corresponding elements of the two matrices

package com.arrays;
import java.io.*;

public class dddsum {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, j;
        int a[][] = new int[4][4];
        int b[][] = new int[4][4];
        int c[][] = new int[4][4];

        System.out.println("Enter elements of Matrix A:");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                a[i][j] = Integer.parseInt(br.readLine());
            }
        }

        System.out.println("Enter elements of Matrix B:");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                b[i][j] = Integer.parseInt(br.readLine());
            }
        }

        
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Sum of corresponding elements (Matrix C):");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
