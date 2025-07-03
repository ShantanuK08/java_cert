package com.mis_test_five;

import java.time.LocalDate;

public class Test_46 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2018-06-06");
        date.minusDays(10);
        System.out.println(date);
    }
}
