// To find the sum of rows and columns

package com.arrays;
import java.util.*;

public class ddrow_column {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int i, j;
		int m[][] = new int[4][4];
		
		System.out.println("Enter the numbers of the matrix:");
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++)
				m[i][j] = in.nextInt();
		}

		System.out.println("The numbers of the matrix are:");
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("The sum of the elements of each row:");
		for (i = 0; i < 4; i++) {
			int r = 0;
			for (j = 0; j < 4; j++) {
				r = r + m[i][j];
			}
			System.out.println("Sum of row " + (i + 1) + " = " + r);
		}

		System.out.println("The sum of the elements of each column:");
		for (j = 0; j < 4; j++) {
			int c = 0;
			for (i = 0; i < 4; i++) {
				c = c + m[i][j];
			}
			System.out.println("Sum of column " + (j + 1) + " = " + c);
		}
	}
}
