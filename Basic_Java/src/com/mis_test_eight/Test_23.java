package com.mis_test_eight;

public class Test_23 {
	
	
	    public static void main(String[] args) {
	        String lol = "lol";  // Line 3

	        System.out.println(lol.toUpperCase() == lol);                         // Line 4
	        System.out.println(lol.toUpperCase() == lol.toUpperCase());          // Line 5
	        System.out.println(lol.toUpperCase().equals(lol));                   // Line 6
	        System.out.println(lol.toUpperCase().equals(lol.toUpperCase()));     // Line 7
	        System.out.println(lol.toUpperCase().equalsIgnoreCase(lol));         // Line 8
	        System.out.println(lol.toUpperCase().equalsIgnoreCase(lol.toUpperCase())); // Line 9–10
	    }
	


}
