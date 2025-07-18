// Question 14


package com.mis_test_eight;


import java.util.Scanner;

// Main class named 'SwitchExample'
public class SwitchExample {

    // main() method: Entry point of any Java program
    public static void main(String[] args) {

        // ---------------------- INPUT SETUP ----------------------

        // Creating a Scanner object 'sc' to read user input from console
        // Data type: Scanner (used to read different types of user input)
        Scanner sc = new Scanner(System.in);  // Standard way to read input from keyboard

        // Prompt the user to enter something
        System.out.print("Enter input: ");

        // Read the full line of input entered by the user
        // 'sc.nextLine()' reads the whole line as String (with spaces if any)
        // '.trim()' removes leading and trailing white spaces from the input
        // Data type: String (to handle text input)
        String s = sc.nextLine().trim();

        // ---------------------- SWITCH LOGIC ----------------------

        // Switch-case block to decide response based on the input string 's'
        switch (s) {
            
            // If the input exactly matches "Hello"
            case "Hello":
                System.out.println("Hi");   // Output greeting
                break;                      // Exit switch after match

            // If the input exactly matches "Goodbye"
            case "Goodbye":
                System.out.println("bye");  // Output farewell
                break;                      // Exit switch after match

            // If input matches neither of the above
            default:
                System.out.println("?");    // Output a generic response
        }

        // ---------------------- RESOURCE CLEANUP ----------------------

        // Close the Scanner object to release system resources
        sc.close();
    }
}
