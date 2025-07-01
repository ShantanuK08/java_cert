package com.mis_test_four;

public class Test_50 {
    public static void main(String[] args) {
        Profitable_50 obj = new Business_50(); //  Upcasting to interface

        //  Interface field accessed via interface reference resolved at compile time
        System.out.println(obj.profitPercentage);

        // To access Business field, cast required
        Business_50 b = (Business_50) obj;
        System.out.println(b.profitPercentage);   
    }
}
