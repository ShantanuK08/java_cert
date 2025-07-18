// Package declaration: groups related Java classes together
package com.mis_test_eight;

// Class declaration: 'Test_12' contains the main method to run the program
public class Test_12 {

    // The main() method: this is the entry point of every Java application
    public static void main(String[] args) {

        // ---------------------- OBJECT CREATION ----------------------

        // Create an instance (object) of AddEmUp class using the default constructor
        // Data type: AddEmUp (user-defined class)
        // 'a' is a reference variable pointing to a new AddEmUp object
        AddEmUp a = new AddEmUp();  // Constructor prints "1" and sets total = 0.0

        // ---------------------- METHOD CALL 1 ----------------------

        // Call the addNums method with a single argument
        // Data type: double (2 is treated as 2.0)
        // Method will print "3" and add 2.0 to total → total becomes 2.0
        a.addNums(2);

        // ---------------------- METHOD CALL 2 ----------------------

        // Call the overloaded addNums method with two arguments:
        // - First argument (4): double → the value to be added
        // - Second argument (1): int → how many times to add the value
        // This adds 4 * 1 = 4 to the existing total → total becomes 6.0
        // Method will print "4"
        a.addNums(4, 1);

        // ---------------------- OUTPUT ----------------------

        // Calls getTotal() method which:
        // - Prints "5"
        // - Returns the current total (6.0)
        // The result is then printed to the console as: Total: 6.0
        System.out.println("Total: " + a.getTotal());
    }
}
