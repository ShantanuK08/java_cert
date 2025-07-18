package com.mis_test_eight;

import java.util.function.Predicate;

public class Test_2 {
    public static void main(String[] args) {
        String[] arr = {"*", "**", "***", "****", "*****"};

        
        Predicate<String> pr1 = getShortLengthPredicate();

        print(arr, pr1);
    }

   
    public static Predicate<String> getShortLengthPredicate() {
        return s -> s.length() < 4;
    }

    private static void print(String[] arr, Predicate<String> predicate) {
        for (String str : arr) {
            if (predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
}







