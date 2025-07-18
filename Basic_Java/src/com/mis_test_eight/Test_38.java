package com.mis_test_eight;

public class Test_38 {
	public static void main(String[] args) {
	    try {
	        throw new Exception("100");
	    } catch (Exception e) {
	        System.out.println("Exception " + e.getMessage());
	    }
	}


}
