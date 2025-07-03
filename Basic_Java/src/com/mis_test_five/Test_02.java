package com.mis_test_five;


interface X1 {
    default void print() {
        System.out.println("X1");
    }
}

interface X2 extends X1 {
    void print(); // abstract, overrides default from X1
}

interface X3 extends X2 {
    default void print() {
        System.out.println("X3");
    }
}

class X implements X3 {}

public class Test_02 {
    public static void main(String[] args) {
        X1 obj = new X(); // Compiles fine
        obj.print();      // Prints: X3
    }
}
