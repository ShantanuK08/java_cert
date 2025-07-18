package com.mis_test_eight;

public class Test_43 {
	public static void main(String[] args) {
	    String x = "Sams";
	    String s = "mimi";
	    s.toUpperCase();
	    s += "nion";
	    String string = s.substring(2,8);
	    string = string + x.charAt(3);
	    System.out.println(string);
	}


}
