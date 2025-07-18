package com.mis_test_eight;  

public class Test_38 {  
  
    public static void main(String[] args) {  
        // Entry point of the program.
        // public: accessible from anywhere.
        // static: does not need an object to run.
        // void: does not return a value.
        // String[] args: command-line arguments passed to the program.

        try {
            // 'try' block is used to wrap code that might throw an exception.

            throw new Exception("100");  
            // 'throw' is used to manually throw an exception.
            // new Exception("100") creates an Exception object with the message "100".
            // 'Exception' is a built-in class in java.lang used to represent runtime errors.

        } catch (Exception e) {
            // 'catch' block is used to handle the exception thrown in 'try'.
            // (Exception e): catches any Exception object, and assigns it to variable 'e'.
            // 'e' is of type Exception.

            System.out.println("Exception " + e.getMessage());  
            // Prints the message from the exception.
            // 'e.getMessage()' returns the string passed in the Exception constructor ("100").
            // Output will be: Exception 100
        }
    }
}
