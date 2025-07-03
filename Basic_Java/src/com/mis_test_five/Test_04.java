package com.mis_test_five;

interface Workable {
    void work();
}

// Try statement 1:
abstract class Work implements Workable {
    public void work() {
        System.out.println("Working...");
    }
}

public class Test_04 {
	public static void main(String [] args) {
		
		Workable obj=new Work() {};// anonymous subclass
		obj.work();
		
		
	}
}
