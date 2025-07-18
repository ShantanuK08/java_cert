package com.mis_test_eight;  


public class Test_6 {  
   

    public static void main(String[] args) {
        // This is the main method — the entry point of the program.
        // 'public' so JVM can access it from outside.
        // 'static' so it can be run without creating an object of Test_6.
        // 'String[] args' holds command-line arguments (not used here).

        Shoes.shopping();  
        // Calls the static method `shopping()` from the Shoes class.
        // This method likely initializes values of shoe1 and shoe2.
        // Since it’s static, we can call it using class name without creating object.

        System.out.println("Shoe 1: " + Shoes.shoe1);  
        // Prints the value of the static variable `shoe1` from Shoes class.
        // Concatenates it with "Shoe 1: " for display.

        System.out.println("Shoe 2: " + Shoes.shoe2);  
        // Prints the value of the static variable `shoe2` from Shoes class.
        // Concatenates it with "Shoe 2: " for display.
    }
}
