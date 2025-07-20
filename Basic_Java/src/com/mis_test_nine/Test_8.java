
package com.mis_test_nine;

import java.util.Arrays;

public class Test_8 {

    // Main method: program entry point
    // Takes an array of Strings as command-line arguments
    public static void main(String[] args) {

        // Check if no command-line arguments are provided
        if (args.length == 0) {
            // If true, print a message and exit the program
            System.out.println("No arguments provided.");
            return;
        }

        // Sorts the input arguments lexicographically (alphabetically)
        Arrays.sort(args);  // In-place sorting of the args array

        // Performs a binary search for the first element (args[0]) in the sorted array
        int result = Arrays.binarySearch(args, args[0]);
        // The index of args[0] will always be 0 after sorting, so result = 0

        // Print the result of the binary search
        System.out.println(result);
    }
}
