package com.mis_test_four;

public class TestInterface44 {
    public static void main(String[] args) {
        SubInterface44 ref = null;  // null reference — valid for accessing static fields

        //  Valid: 'name' is a static field inherited from SuperInterface44
        // Even though ref is null, the field access resolves to SuperInterface44.name at compile-time
        System.out.println(ref.name); 
    }
}