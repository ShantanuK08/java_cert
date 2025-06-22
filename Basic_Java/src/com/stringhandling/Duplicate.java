// to delete repeated letters present in an word

package com.stringhandling;
import java.util.*;

public class Duplicate {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s1, s2 = "";
        int i, p, j, t;
        System.out.print("Enter a String: ");
        s1 = in.next(); // change to in.nextLine() if full sentence is needed
        char ch1, ch2;
        p = s1.length();

        for (i = 0; i < p; i++) {
            ch1 = s1.charAt(i);
            t = 0; // ❗ FIXED: missing semicolon

            for (j = 0; j < s2.length(); j++) {
                ch2 = s2.charAt(j);
                if (ch1 == ch2)
                    t = 1;
            }

            if (t == 0)
                s2 = s2 + ch1;
        }

        System.out.println("The new String after removing duplicate letters: " + s2);
    }
}
