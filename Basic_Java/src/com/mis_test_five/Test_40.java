package com.mis_test_five;

import java.io.FileNotFoundException;

public class Test_40 {
    public static void main(String[] args) {
        try {
            System.out.println(1);
        } catch (NullPointerException ex) {
            System.out.println("ONE");
        } catch (FileNotFoundException ex) {
            System.out.println("TWO");
        }
        System.out.println("THREE");
    }
}


