package com.basicprograms;
import java.util.*;

class Encode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char c, ch = 0;
        int t = 0;

        System.out.println("Enter a letter: ");
        c = in.next().charAt(0);

        if(Character.isUpperCase(c)) {
            t = (int)c - 3;
            ch = (char)t;
            System.out.println("Encoded letter is: " + ch);
        } else {
            System.out.println("Please enter an uppercase letter.");
        }

        in.close();
    }
}
