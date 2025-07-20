
package com.mis_test_nine;

class Grandparent {

    // Method named foo that takes an int as a parameter and returns void
    public void foo(int x) {
        // Prints the message with the value of x
        System.out.println("Grandparent Foo " + x);
    }
}

// Parent class extends Grandparent, meaning it inherits Grandparent’s methods
class Parent extends Grandparent {

    // Method overloading: a new foo method with two int parameters
    // This does NOT override the Grandparent's method; it's a different signature
    public void foo(int x, int y) {
        // Prints a message with both x and y
        System.out.println("Parent Foo " + x + " " + y);
    }
}

// Main public class with the entry point of the application
public class Test_46 {
    public static void main(String[] args) {
        // Creates an instance of Parent class
        Parent p = new Parent();

        // Calls foo(int) method — Java will look in Parent, not find foo(int), so it uses Grandparent's foo(int)
        // Because Parent *inherits* foo(int) from Grandparent
        p.foo(1); // Output: Grandparent Foo 1
    }
}
