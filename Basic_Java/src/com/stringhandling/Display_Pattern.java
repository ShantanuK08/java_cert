package com.stringhandling;
import java.util.*;

public class Display_Pattern {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a, b, p, k, j;
        char chr;
        String str;

        System.out.println("Enter 1 to display 'Pattern1' & 2 to display 'Pattern 2'");
        System.out.print("Enter your choice: ");
        k = in.nextInt();

        switch (k) {
            case 1:
                System.out.println("The Pattern 1:");
                for (a = 69; a >= 65; a--) {
                    for (b = 65; b <= a; b++) {
                        chr = (char) (b);
                        System.out.print(chr);
                    }
                    System.out.println();
                }
                break;

            case 2:
                System.out.println("The Pattern 2:");
                System.out.print("Enter a string in uppercase: ");
                str = in.next();
                p = str.length();
                for (j = 0; j < p; j++) {
                    chr = str.charAt(j);
                    System.out.println(chr);
                }
                break;

            default:
                System.out.println("Entered wrong choice!!");
        }

        in.close();  // Good practice to close the scanner
    }
}
