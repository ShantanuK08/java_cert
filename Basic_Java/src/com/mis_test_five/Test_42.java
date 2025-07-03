package com.mis_test_five;

public class Test_42 {
    static {
        System.out.println(1 / 0);  // Runtime error here
    }

    public static void main(String[] args) {
        System.out.println("HELLO");
    }
}
