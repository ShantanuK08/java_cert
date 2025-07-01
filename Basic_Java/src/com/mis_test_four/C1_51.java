package com.mis_test_four;

// Implements I1_51 but defines its own instance method — NOT overriding
public class C1_51 implements I1_51 {
    void print(String str) {
        System.out.println("C1: " + str.toLowerCase());
    }
}
