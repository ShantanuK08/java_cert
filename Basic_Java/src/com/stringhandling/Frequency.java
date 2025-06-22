package com.stringhandling;
import java.util.*;

public class Frequency {
    public static void main(String args[]) {
        String st, st1 = "", st2 = "";
        int i, p, f = 0;
        char chr;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string:");
        st = in.nextLine(); // Only one needed

        System.out.print("Enter a word to be searched in the string: ");
        st1 = in.nextLine();

        st = st + " ";  // Add space to handle last word
        p = st.length();

        for (i = 0; i < p; i++) {
            chr = st.charAt(i);
            if (chr == ' ') {
                if (st2.compareTo(st1) == 0)
                    f = f + 1;
                st2 = "";
            } else {
                st2 = st2 + chr;
            }
        }

        System.out.println("Frequency of searched word present in the string: " + f);
    }
}
