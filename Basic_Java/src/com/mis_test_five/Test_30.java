package com.mis_test_five;

public class Test_30 {
    private static void m1() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {
        try {
            m1();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("A");
        }
    }
}
