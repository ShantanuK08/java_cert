
package com.mis_test_nine;

public class Test_26 {

    // Main method – this is the starting point of execution
    public static void main(String[] args) {

        // Declare and initialize a final String variable 'cell' with a string literal "a"
        // Data type: String (immutable class in java.lang)
        // 'final' means the reference cannot be changed after assignment
        final String cell = "a";

        // Create a new String object explicitly using the 'new' keyword with the same value "a"
        // Although the content is the same as 'cell', this creates a separate object in the heap
        String foo = new String("a");

        // Create another final String object 'bell' using the value of foo (which is also "a")
        // Again, this results in a new String object in memory (not the same as the interned literal "a")
        final String bell = new String(foo);

        // Print two things:
        // 1. (cell == bell): Compares memory references (whether both point to the same object) → false
        // 2. cell.equals(bell): Compares actual string content/values → true
        // So output will be: false true
        System.out.print((cell == bell) + " " + cell.equals(bell));
    }
}
