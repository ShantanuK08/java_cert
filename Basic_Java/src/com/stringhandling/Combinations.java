
// To display the pattern of a String as per the user's choice

package com.stringhandling;
import java.io.*;

public class Combinations {
    public static void main(String args[]) throws IOException {
        String str;
        int i, j, k, p;

        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("Enter a three-letter word:");
        str = in.readLine();
        p = str.length();

        System.out.println("All possible combinations of the word:");
        for (i = 0; i < p; i++) {
            for (j = 0; j < p; j++) {
                for (k = 0; k < p; k++) {
                    if (i != j && j != k && k != i) {
                        System.out.println(str.charAt(i) + "" + str.charAt(j) + "" + str.charAt(k));
                    }
                }
            }
        }
    }
}
