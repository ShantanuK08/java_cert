package com.stringhandling;
import java.util.*;

public class Rev_Char {
    public static void main(String args[]) {
        String st, st1 = "", st2 = "";
        int i, p;
        char chr;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string:");
        st = in.nextLine();
        st = st + " ";  // Add space at end to process the last word
        p = st.length();

        for (i = 0; i < p; i++) {
            chr = st.charAt(i);
            if (chr != ' ') {
                st1 = chr + st1;  // reverse each word
            } else {
                st2 = st2 + st1 + " ";  // add reversed word to final result
                st1 = "";  // reset for next word
            }
        }

        System.out.println("Reversed characters in each word:");
        System.out.println(st2.trim());
    }
}
