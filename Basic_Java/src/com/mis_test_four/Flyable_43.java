package com.mis_test_four;

// Interface with a static and a default method
public interface Flyable_43 {

    //  Static method — not inherited by implementing class
    static int horizontalDegree() {
        return 20;
    }

    //  Default method can be inherited by implementing classes
    // Must access static method using interface name
    default void fly() {
        System.out.println("Flying at " + Flyable_43.horizontalDegree() + " degrees.");
    }

    // Abstract method to be implemented
    void land();
}
