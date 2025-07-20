// Package declaration – organizes this class under the package com.mis_test_nine
package com.mis_test_nine;


import java.util.Scanner;

public class Test_15 {

    public static void main(String[] args) {

        // Create a Scanner object named 'sc' to read input from the keyboard (System.in)
        // Data type: Scanner (from java.util package)
        Scanner sc = new Scanner(System.in);

        // Print a message prompting the user to enter a number
        System.out.print("Enter a number: ");

        // Read an integer input from the user and store it in 'num'
        // Data type: int – used to store whole numbers
        int num = sc.nextInt();

        // Declare a boolean variable 'seven' to store true or false
        // Data type: boolean – holds either true or false
        boolean seven;

        // Check if the number entered is equal to 7
        // If true, assign 'true' to variable seven
        if (num == 7) {
            seven = true;
        } 
        // Otherwise, assign 'false' to variable seven
        else {
            seven = false;
        }

        // Print whether the number is seven or not
        // Concatenates the string with the value of boolean variable 'seven'
        System.out.println("Is the number seven? " + seven);
    }
}
