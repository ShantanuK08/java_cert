package com.mis_test_nine;

import java.util.Scanner;

public class Test_15 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read an integer

        boolean seven; // Declare the boolean variable outside the if-else block

        // Check if number is 7
        if (num == 7) {
            seven = true;
        } else {
            seven = false;
        }

        // Print the value of seven
        System.out.println("Is the number seven? " + seven);
    }
}
