
package com.mis_test_nine;


import java.time.LocalDate;
import java.time.Month;

// Class declaration – the class is named Test_10, which contains the main method
public class Test_10 {

    // Main method – this is the entry point of the Java program
    public static void main(String[] args) {

        // Declare and initialize a variable 'count' of type int 
        int count = 0;

        // Declare and initialize a LocalDate object with the date: 1st January 2017
        // LocalDate is an immutable date-time class that represents a date without time or timezone
        LocalDate date = LocalDate.of(2017, Month.JANUARY, 1);

        // while loop – continues as long as the month of the 'date' is NOT APRIL
        // getMonth() returns the month part of the date as an enum value of type Month
        while (date.getMonth() != Month.APRIL) {
            // Subtract one month from 'date' in each iteration
            // minusMonths(1) returns a new LocalDate object (since LocalDate is immutable)
            date = date.minusMonths(1);
        }

        // After the loop ends, increment count by 1
        // This line only executes once after the loop
        count++;

        // Print the final value of 'count'
        // Expected output is 1 because the loop runs silently and count is incremented only once after the loop
        System.out.println(count); 
    }
}
