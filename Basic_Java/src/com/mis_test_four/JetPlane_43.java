package com.mis_test_four;

// Class that implements Flyable_43 interface
public class JetPlane_43 implements Flyable_43 {

    //  Implementing abstract method
    @Override
    public void land() {
        System.out.println("Landing at " + -Flyable_43.horizontalDegree() + " degrees.");
    }

    // Main method to test behavior
    public static void main(String[] args) {
        JetPlane_43 plane = new JetPlane_43();
        plane.fly();   // Calls default method from interface
        plane.land();  // Calls overridden method in this class
    }
}
