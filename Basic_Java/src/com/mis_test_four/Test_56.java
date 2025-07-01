package com.mis_test_four;

public class Test_56 {
    public static void main(String[] args) {
        MyLogger_56 logger = new MyLogger_56();

        // Calls instance method from interface
        logger.instanceLog();   

        // Calls static method from abstract class
        Log_56.staticLog();    
    }
}
