package com.stringhandling;
import java.util.*;

public class Alphabet {
    public static void main(String args[]) {
        int i, j, p;
        char ch;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = in.nextLine();
        p = str.length();

        System.out.println("The letters arranged in alphabet order:");
        for (i = 65; i <= 90; i++) { 
            for (j = 0; j < p; j++) {
                ch = str.charAt(j);
                if (ch == (char) i || ch == (char) (i + 32)) { 
                    System.out.print(ch);
                }
            }
        }
    }
}
