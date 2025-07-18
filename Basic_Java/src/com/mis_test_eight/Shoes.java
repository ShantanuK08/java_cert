
package com.mis_test_eight;


public class Shoes {

    // ---------------------- FIELD 1 -----------------------
    // Static variable (shared by all instances of the class)
    // Data type: String (object type to store text)
    // Initialized using 'new String("sandal")' to explicitly create a new String object in heap memory
    public static String shoe1 = new String("sandal");

    // ---------------------- FIELD 2 -----------------------
    // Another static String variable initialized to a new object with value "flip flop"
    public static String shoe2 = new String("flip flop");

    // ---------------------- METHOD -----------------------
    // Static method: can be called without creating an object of the Shoes class
    // Purpose: change references between the shoe variables
    public static void shopping() {

        // Local variable inside the method
        // 'shoe3' is a new String object with value "croc"
        // It's not static — only exists when shopping() runs
        String shoe3 = new String("croc");

        // Reassigns the static variable 'shoe2' to refer to the same object as 'shoe1' ("sandal")
        shoe2 = shoe1;

        // Reassigns the static variable 'shoe1' to refer to 'shoe3' ("croc")
        shoe1 = shoe3;

        // After this method runs:
        // shoe1 → "croc"
        // shoe2 → "sandal"
        // shoe3 → local, temporary, refers to "croc"
    }
}
