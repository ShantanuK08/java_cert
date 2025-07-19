package com.mis_test_nine;

import java.util.Arrays;

public class Test_12 {
    public static void main(String[] args) {
        Arrays.sort(args); // Ensure correct binary search
        int result = Arrays.binarySearch(args, args[0]);
        System.out.println(result); // Always prints: 0
    }
}
