
package com.mis_test_nine;


interface Plant {
    
    // Default method grow() in interface
    // Data type: String (return type)
    // 'default' allows interface to provide method implementation (Java 8+ feature)
    default String grow() {
        return "Grow!";
    }
}

interface Living {
    
    // Default method grow() in this interface too
    // This creates a method conflict when a class implements both interfaces
    default String grow() {
        return "Growing!";
    }
}

public class Test_3 implements Plant, Living {

    // Must override grow() to resolve method conflict between Plant and Living
    @Override
    public String grow() {
        // Resolving conflict by choosing Plant's version of grow()
        // Can also use: return Living.super.grow();
        return Plant.super.grow();
    }

    // Overloaded version of grow(), with an int parameter
    // This does NOT override the interface method – it's a different method
    public String grow(int height) {
        return "Super Growing!";
    }

    // main() method – entry point of the program
    public static void main(String[] args) {

        // Reference type: Plant (interface), Object type: Test_3
        // This is legal because Test_3 implements Plant
        Plant p = new Test_3();

        // Casting reference 'p' to Living interface to call grow()
        // But since Test_3 has overridden grow(), that version will be called
        // It uses Plant.super.grow(), so output will be "Grow!"
        System.out.print(((Living)p).grow());
    }
}
