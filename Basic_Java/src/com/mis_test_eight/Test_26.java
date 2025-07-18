
package com.mis_test_eight;


public class Test_26 {
	
    // Main method - this is the entry point of the Java program.
    // 'String[] args' is a parameter used to accept command-line arguments.
	public static void main(String[] args) {

	    // Declaring an array of Strings named 'vicky'.
	    // 'new String[3]' creates an array that can hold 3 String elements.
	    // By default, all elements will be initialized to null.
	    String[] vicky = new String[3];  // Datatype: String[] (array of Strings)

	    // Printing the array reference 'vicky'.
	    // This does NOT print the contents of the array.
	    // Instead, it prints something like [Ljava.lang.String;@15db9742 which is the memory reference.
	    System.out.print(vicky);
	}
}
