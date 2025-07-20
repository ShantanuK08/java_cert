
package com.mis_test_nine;

public class Test_5 {

    // main() method is the entry point of any Java application
    // String... args means it can take a variable number of String arguments (varargs)
    public static void main(String... args) {

        // Declare and initialize a String array named nycTourLoops
        // It holds names of tour loops in New York City
        String[] nycTourLoops = new String[] { "Downtown", "Uptown", "Brooklyn" };
        // Data Type: String[] (Array of Strings)
        // Purpose: Store different tour loop locations

        // Declare and initialize another String array named times
        // It holds the time slots available for the tours
        String[] times = new String[] { "Day", "Night" };
        // Data Type: String[] (Array of Strings)
        // Purpose: Store different time periods (Day and Night)

        // A for loop that iterates through both arrays simultaneously
        // int i and j are loop control variables, both start at 0
        // i < nycTourLoops.length ensures loop runs only as many times as there are locations
        // i++, j++ increments both i and j by 1 in each iteration
        for (int i = 0, j = 0; i < nycTourLoops.length; i++, j++) {

            // Print the current elements from both arrays in a formatted string
            // Example output: "Downtown Day", "Uptown Night"
            System.out.println(nycTourLoops[i] + " " + times[j]);

            //  NOTE: This code has a potential bug:
            // times[] has only 2 elements, but nycTourLoops[] has 3.
            // On the 3rd iteration (i = 2, j = 2), times[2] will throw ArrayIndexOutOfBoundsException.
            // This code will compile, but it will crash at runtime.
        }
    }
}
