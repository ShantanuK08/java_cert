package com.mis_test_five;

public class Test_37 {
    public static void main(String[] args) {
        try {
            main(args); // recursive call to main
        } catch (Exception ex) {
            System.out.println("CATCH-");
        }
        System.out.println("OUT");
    }
}
