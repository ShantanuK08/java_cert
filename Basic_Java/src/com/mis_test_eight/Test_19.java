
package com.mis_test_eight;


public class Test_19 {

    // Main method: The entry point of any Java application.
    // It takes an array of Strings called args as an input parameter.
    public static void main(String[] args) {

        // Declaring and initializing a variable 'm' of type double with value 2.0
        // Data type: double (used for floating-point numbers)
        double m = 2.0;

        // Declaring and initializing another variable 'n' of type double with value 3.0
        double n = 3.0;

        // while loop checks the condition: m < n
        // If true, it enters the loop body. It will continue looping until the condition becomes false.
        while (m < n) {

            // Prints the current values of m and n in the format: "m = 2.0, n = 3.0"
            // Used for observing how the value of 'm' changes with each iteration.
            System.out.println("m = " + m + ", n = " + n);

            // Incrementing the value of m by 0.5 on each iteration.
            // This ensures the loop eventually ends (when m >= n).
            m += 0.5;
        }
    }
}
