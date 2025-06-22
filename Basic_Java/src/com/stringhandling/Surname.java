package com.stringhandling;
import java.util.*;

public class Surname {
    public static void main(String args[]) {
        String st, sn, st1 = "", st2 = "";
        int i, p;
        char chr;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the full name:");
        st = in.nextLine();
        p = st.lastIndexOf(' ');
        sn = st.substring(p + 1);

        for(i = 0; i < p; i++) {
            chr = st.charAt(i);
            if(chr == ' ')
                st1 = st1 + st.charAt(i + 1) + ".";
        }

        st2 = st1 + sn;

        System.out.println("Initials with surname:");
        System.out.println(st2);
    }
}
