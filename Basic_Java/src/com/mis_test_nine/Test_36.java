
package com.mis_test_nine;

public class Test_36 {

    // Method 'foo' that accepts an array of integers
    // It increments the first element of the array by 1
    public void foo(int[] x) {
        // x[0] = x[0] + 1;
        // Here, x is a reference to an int array. This line increases the value at index 0 by 1.
        x[0] = x[0] + 1;
    }

    // Main method: entry point of the Java application
    public static void main(String[] args) {

        // Create an integer array 'a' of size 10
        // All values are initialized to 0 by default in Java
        int[] a = new int[10];

        // Create another array reference 'b' and point it to the same array as 'a'
        // Both 'a' and 'b' now refer to the *same* memory location
        int[] b = a;

        // Create an instance of the Test_36 class to call the non-static method foo()
        Test_36 obj = new Test_36();

        // Call method foo(), passing array 'a' as an argument
        // Inside foo(), the first element of the array is incremented by 1
        obj.foo(a); // a[0] becomes 1

        // Print the first element of both 'a' and 'b'
        // Since both reference the same array, both will show the updated value 1
        System.out.println(a[0] + " " + b[0]);  // Output: 1 1
    }
}
