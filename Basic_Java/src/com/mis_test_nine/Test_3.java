package com.mis_test_nine;

interface Plant {
    default String grow() {
        return "Grow!";
    }
}

interface Living {
    default String grow() {
        return "Growing!";
    }
}

public class Test_3 implements Plant, Living {

    // Conflict resolver: must override grow() to avoid ambiguity
    @Override
    public String grow() {
        return Plant.super.grow(); // or Living.super.grow()
    }

    // Overloaded method, not overriding the one from interfaces
    public String grow(int height) {
        return "Super Growing!";
    }

    public static void main(String[] args) {
        Plant p = new Test_3();
        System.out.print(((Living)p).grow()); // Output: Grow!
    }
}
