package com.mis_test_five;

import java.time.LocalDate;

public class Test_22 {
	public static void main(String [] args) {
		LocalDate date = LocalDate.parse("2020-08-31");
		System.out.println(date.plusMonths(-6));
	}

}
