package com.mis_test_five;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class Test_18 {
	public static void main(String []args) {
		LocalDate date1 = LocalDate.parse("1945-08-15", DateTimeFormatter.ISO_DATE);
		LocalDate date2 = LocalDate.parse("1947-08-15", DateTimeFormatter.ISO_LOCAL_DATE);
		LocalDate date3 = LocalDate.of(1947, 8, 15);
		
		
		
		System.out.println(date1.equals(date2) + ":"  + date2.equals(date3));
	}

}
