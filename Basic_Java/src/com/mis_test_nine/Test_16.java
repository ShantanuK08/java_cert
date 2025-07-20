
package com.mis_test_nine;

public class Test_16 {

    // Static inner class named Circle – defines properties and behavior of a circle
    static class Circle {

        // Instance variable 'radius' of type double, initialized to 10.0
        // Data type: double – used for decimal values (floating point numbers)
        double radius = 10.0;

        // x-coordinate of the circle's center
        double x = 100.0;

        // y-coordinate of the circle's center
        double y = 100.0;

        // Method to calculate the area of the circle
        // Return type: double (area will be a floating-point number)
        double getArea() {
            // Area of a circle = π × r²
            // Math.PI is a built-in constant for π
            return Math.PI * radius * radius;
        }
    }

    // Main method – this is the entry point of the program
    public static void main(String[] args) {

        // Create an object of Circle class using the default constructor
        // Data type: Circle (user-defined class)
        Circle c = new Circle();

        // Call the getArea() method using object 'c' and print the result
        // Output: Area of circle with radius 10.0
        System.out.println("Area of circle: " + c.getArea());
    }
}
