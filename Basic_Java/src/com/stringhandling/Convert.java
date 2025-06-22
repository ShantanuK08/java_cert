package com.stringhandling;
import java.util.*;

public class Convert {
    public static void main(String args[]) {
        String str1 = "", str;
        int i, p;
        char chr, chr1;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        str = in.nextLine();

        str = " " + str; // Add leading space to handle first word
        p = str.length();

        for (i = 0; i < p; i++) {
            chr = str.charAt(i);
            if (chr == ' ') {
                if (i + 1 < p) {
                    chr1 = str.charAt(i + 1);
                    str1 = str1 + Character.toUpperCase(chr1);
                    i = i + 1;
                }
            } else {
                str1 = str1 + chr;
            }
        }

        System.out.println("The new String after changing the first letter of the words:");
        System.out.println(str1);
    }
}
