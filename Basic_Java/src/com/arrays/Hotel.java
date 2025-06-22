// A program for room allocation work for a visitor

package com.arrays;
import java.io.*;

public class Hotel {
	public static void main(String args[]) throws IOException {
		InputStreamReader read = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(read);
		int i, j, k = 1; // k starts from 1 because you are using name[1 to 499]
		String name[] = new String[500];
		String m[][] = new String[10][50];

		
		for (i = 1; i < 500; i++) {
			System.out.println("Enter the name of the visitor " + i + ":");
			name[i] = in.readLine();
		}

		
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 50; j++) {
				m[i][j] = name[k];
				k++;
			}
		}

		
		System.out.println("\nRoom Allocation:");
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 50; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
