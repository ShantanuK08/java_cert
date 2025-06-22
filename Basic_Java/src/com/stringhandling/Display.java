package com.stringhandling;
import java.util.*;

public class Display {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a, p;
        String str;
        char ch, chr;

        System.out.println("Enter a string in uppercase with words separated by spaces:");
        str = in.nextLine();

        System.out.println("Enter 'F' to display all the first characters of each word,");
        System.out.println("'L' to display all the last characters of each word");
        System.out.print("Enter your choice: ");
        ch = in.next().charAt(0);

        String[] words = str.split(" ");  // Split string into words

        switch (ch) {
            case 'F':
                System.out.println("The first characters of each word:");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        System.out.println(word.charAt(0));
                    }
                }
                break;

            case 'L':
                System.out.println("The last characters of each word:");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        System.out.println(word.charAt(word.length() - 1));
                    }
                }
                break;

            default:
                System.out.println("Entered wrong choice!!");
        }

        in.close();
    }
}
