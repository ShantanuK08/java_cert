package com.mis_test_five;

import java.time.LocalDate;
import java.time.Period;

public class Test_48 {
    public static void main(String[] args) {
        //  Correct quotes used here
        LocalDate date = LocalDate.parse("2000-01-01");
        Period period = Period.ofYears(-3000);
        System.out.println(date.plus(period));
    }
}
