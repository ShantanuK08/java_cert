package com.mis_test_four;

abstract class food {
    protected abstract double getCalorie(); // Correct method signature
}

class Junkfood extends food {
    @Override
    protected double getCalorie() { // Match method name and visibility
        return 200.0;
    }
}

public class Test_26 { 
    public static void main(String[] args) {
        food myFood = new Junkfood();
        System.out.println("Calories: " + myFood.getCalorie());
    }
}
