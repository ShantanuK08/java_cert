package com.mis_test_five;

public class Test_28 {
	private static void m1() {
		System.out.println(1/0);
	}
	public static void main(String []args) {
		try {
			m1();
		}
		finally {System.out.println("A");}
	}

}


//m1() is called, which attempts 1 / 0 → throws ArithmeticException.
//The try block is exited immediately upon the exception.
//The finally block still executes no matter what → prints A.
//The exception is not caught, so it propagates to the JVM.
//After printing A, the program terminates with the uncaught exception stack trace.






