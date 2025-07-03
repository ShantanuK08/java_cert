package com.mis_test_five;

public class Test_38 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try {
            for (;;) { // Infinite loop
                sb.append("OCA");
            }
        } catch (Exception e) {
            System.out.println("Exception!!!");
        }
        System.out.println("Main ends!!!");
    }
}
