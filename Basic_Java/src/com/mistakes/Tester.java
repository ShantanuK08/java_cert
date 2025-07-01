package com.mistakes;

public class Tester {
	public static void main(String [] args) {
		boolean b1=true;
		boolean b2=false;
		if (b1 & b2 | b1) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
	}

}
