package com.mis_test_eight; 

public class Test_23 {  

    public static void main(String[] args) {  // Main method, the entry point of Java programs

        // Line 3: Declares and initializes a String variable named 'lol'
        // Data type: String (immutable sequence of characters)
        String lol = "lol";

        // Line 4: Compares the memory address (reference) of 'lol.toUpperCase()' with 'lol' using '=='
        // toUpperCase() returns a new String "LOL"
        // '==' checks if both variables refer to the **same object** (not the same content)
        // So: "LOL" != "lol" ⇒ false
        System.out.println(lol.toUpperCase() == lol);  // Output: false

        // Line 5: Compares two calls to 'lol.toUpperCase()' using '=='
        // Even though both return "LOL", the JVM may or may not reuse the same object in memory
        // Usually false (not guaranteed to be the same object)
        System.out.println(lol.toUpperCase() == lol.toUpperCase());  // Output: false (usually)

        // Line 6: Uses 'equals()' to compare content of 'lol.toUpperCase()' ("LOL") with 'lol' ("lol")
        // equals() checks character-by-character content equality
        System.out.println(lol.toUpperCase().equals(lol));  // Output: false

        // Line 7: Uses 'equals()' to compare the result of 'lol.toUpperCase()' with itself
        // Both have the same content ("LOL"), so it returns true
        System.out.println(lol.toUpperCase().equals(lol.toUpperCase()));  // Output: true

        // Line 8: Uses equalsIgnoreCase() which compares content ignoring case differences
        // "LOL" and "lol" are equal when ignoring case
        System.out.println(lol.toUpperCase().equalsIgnoreCase(lol));  // Output: true

        // Line 9–10: Compares two "LOL" strings using equalsIgnoreCase()
        // They are already in uppercase and equal, so returns true
        System.out.println(lol.toUpperCase().equalsIgnoreCase(lol.toUpperCase()));  // Output: true
    }

}
