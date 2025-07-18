
package com.mis_test_eight;


public class AddEmUp {

    // Instance variable (field) declaration
    // 'total' will store the running total of added numbers
    // Data type: double (chosen for decimal/floating-point precision)
    private double total;

    // ---------------------- CONSTRUCTOR 1 -----------------------
    // Default constructor: called when you create an object with no parameters
    // Example: AddEmUp obj = new AddEmUp();
    public AddEmUp() {
        System.out.println("1");  // For testing/debugging - indicates this constructor was called
        total = 0.0;              // Initialize total to 0.0 (starting point for summing)
    }

    // ---------------------- CONSTRUCTOR 2 -----------------------
    // Parameterized constructor: allows setting an initial total
    // Parameter 'firstNum' is of type double to accept decimal input
    public AddEmUp(double firstNum) {
        System.out.println("2");  // For debugging - indicates this constructor was called
        total = firstNum;         // Set the initial total to the passed-in number
    }

    // ---------------------- METHOD 1 -----------------------
    // Method to add a single number to the total
    // Parameter 'n' is a double (for decimal support)
    // Return type: void (does not return anything)
    public void addNums(double n) {
        System.out.println("3");  // Debug print
        total += n;               // Add n to the current total (same as: total = total + n)
    }

    // ---------------------- METHOD 2 -----------------------
    // Overloaded method to add a number multiple times
    // 'n' is the number to add (double), 'numToAdd' is how many times (int, since it's a count)
    // This method increases total by (n * numToAdd)
    public void addNums(double n, int numToAdd) {
        System.out.println("4");      // Debug print
        total += n * numToAdd;        // Multiply n by numToAdd and add to total
    }

    // ---------------------- METHOD 3 -----------------------
    // Getter method to return the current total
    // Return type: double (because total is a double)
    public double getTotal() {
        System.out.println("5");  // Debug print
        return total;             // Return the total
    }
}
