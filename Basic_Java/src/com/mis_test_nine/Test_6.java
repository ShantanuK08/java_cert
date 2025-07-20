package com.mis_test_nine;


public class Test_6 {
  

    public static void seasons(String... names) {
        // A static method named `seasons` that accepts a variable number of String arguments.
        // The `String...` is a varargs (variable arguments) feature in Java. It lets you pass multiple strings like an array.
        // Inside the method, `names` behaves like a String[] array.

        int l = names[1].length(); // s1
        // names[1] → refers to the second string in the varargs list → "Fall"
        // names[1].length() → gives the length of the string "Fall", which is 4
        // So, l = 4

        System.out.println(names[l]); // s2
        // names[4] → tries to access the 5th element of the array: 
        // ["Summer", "Fall", "Winter", "Spring"] → only has 4 elements → index 0 to 3
        // Index 4 is out of bounds → this line throws `ArrayIndexOutOfBoundsException` at runtime
    }

    public static void main(String[] args) {
        // The main method: program entry point

        seasons("Summer", "Fall", "Winter", "Spring");
        // Calls the `seasons` method with 4 string arguments
        // These get stored in the `names` array: names[0] = "Summer", names[1] = "Fall", etc.
    }
}
