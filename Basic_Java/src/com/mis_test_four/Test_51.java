package com.mis_test_four;

public class Test_51 {
    public static void main(String[] args) {
        // Case 1: Call static method via interface name
        I1_51.print("Java"); // Output: I1: JAVA

        // Case 2: Call instance method from C1_51 using its own reference
        C1_51 obj = new C1_51();
        obj.print("Java"); // Output: C1: java
    }
}


//Concept and Behavior
//static method in interface:Can be called only using interface name
//Not overridden  :	A static method cannot be overridden by instance methods
//obj.print("Java") where obj is of type I1	: Error — static method not accessible via reference
//Correct way to call:	I1.print("Java")
//Polymorphism	: Applies only to instance methods, not static
