package com.mis_test_eight; 

public class Test_43 {  
	public static void main(String[] args) {  
	    // Declare a String variable named `x` and assign it the value "Sams"
	    // String is an object datatype used to represent text
	    String x = "Sams";

	    // Declare another String variable `s` and assign it "mimi"
	    String s = "mimi";

	    // Convert the string `s` to uppercase, but DO NOT store the result
	    // This does nothing because strings are immutable in Java
	    // The result of s.toUpperCase() is discarded
	    s.toUpperCase();  

	    // Append "nion" to `s`. Now `s` becomes "miminion"
	    // The += operator creates a new String object and assigns it back to s
	    s += "nion";

	    // Extract a substring from index 2 (inclusive) to 8 (exclusive) from s
	    // "miminion" => indices: 0-m, 1-i, 2-m, 3-i, 4-n, 5-i, 6-o, 7-n
	    // Result: "minion"
	    String string = s.substring(2, 8);  

	    // x.charAt(3) gets the character at index 3 from "Sams" => 's'
	    // Then it appends 's' to "minion", so final string becomes "minions"
	    string = string + x.charAt(3);  

	    // Print the final string to console => "minions"
	    System.out.println(string);  
	}
}
