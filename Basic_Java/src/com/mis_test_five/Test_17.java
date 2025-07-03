package com.mis_test_five;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test_17 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1987, 9, 1);
        String str = date.format(DateTimeFormatter.ISO_DATE); 
        System.out.println("Date is: " + str); 
    }
}
