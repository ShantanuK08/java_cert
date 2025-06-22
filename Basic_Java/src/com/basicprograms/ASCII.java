package com.basicprograms;
import java.util.*;

class ASCII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c;
        int i, s = 0;

        System.out.println("Enter any 10 characters:");
        for(i = 1; i <= 10; i++) {
            c = in.next().charAt(0);
            s = s + (int)c;
        }

        System.out.println("Sum of the ASCII codes: " + s);
        in.close();
    }
}
