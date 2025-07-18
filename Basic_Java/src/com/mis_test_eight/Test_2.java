package com.mis_test_eight;  

import java.util.function.Predicate;  

public class Test_2 { 
    public static void main(String[] args) {  // Entry point of the Java application
        // String array initialization with 5 string elements of increasing length
        String[] arr = {"*", "**", "***", "****", "*****"};  

        // pr1 is a Predicate of type String that is initialized using a static method
        Predicate<String> pr1 = getShortLengthPredicate();  

        // Calls the print method with array and predicate to filter and print qualifying strings
        print(arr, pr1);  
    }

    // Static method that returns a Predicate<String>
    // The predicate checks if the length of a given string is less than 4
    public static Predicate<String> getShortLengthPredicate() {
        return s -> s.length() < 4;  // Lambda expression: takes string 's', returns true if length < 4
    }

    // Method to print strings from the array that pass the predicate test
    private static void print(String[] arr, Predicate<String> predicate) {
        // Enhanced for-loop to iterate through each string in the array
        for (String str : arr) {
            // If the current string satisfies the predicate (i.e., length < 4), print it
            if (predicate.test(str)) {
                System.out.println(str);  // Prints qualifying string
            }
        }
    }
}
