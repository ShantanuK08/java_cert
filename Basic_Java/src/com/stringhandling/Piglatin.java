package com.stringhandling;
import java.util.Scanner;

public class Piglatin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = in.next();

        int x = str.length(), y;
        String str1, str2;
        char b = 0;

        System.out.println("The Pig Latin form of the given string:");
        for (y = 0; y < x; y++) {
            b = str.charAt(y);
            if (b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u' ||
                b == 'A' || b == 'E' || b == 'I' || b == 'O' || b == 'U') {
                break;
            }
        }

        str1 = str.substring(y); // part from first vowel to end
        str2 = str.substring(0, y); // part before first vowel
        System.out.println(str1 + str2 + "ay");
    }
}
