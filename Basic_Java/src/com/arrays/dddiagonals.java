// To find the sum of left and right diagonal elements

package com.arrays;
import java.util.*;

public class dddiagonals {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int i, j, ld = 0, rd = 0;
		int m[][] = new int[4][4];

		System.out.println("Enter the numbers of the matrix:");
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				m[i][j] = in.nextInt();
			}
		}

		System.out.println("The numbers of the matrix are:");
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 4; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}

		
		for (i = 0; i < 4; i++) {
			ld = ld + m[i][i];            
			rd = rd + m[i][3 - i];        
		}

		System.out.println("Sum of Left Diagonal = " + ld);
		System.out.println("Sum of Right Diagonal = " + rd);
	}
}
