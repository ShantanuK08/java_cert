package com.mis_test_five;

import java.time.Period;

public class Test_11 {
	public static void main(String [] args) {
		Period period = Period.of(0,0,0);
		System.out.println(period);
	}

}



// Period represents a date-based amount of time (years, months, days)

// Creating a Period
//Period p = Period.of(1, 2, 3);      // 1 year, 2 months, 3 days
//Period zero = Period.of(0, 0, 0);   // same as Period.ZERO

// toString() output
//Starts with 'P', only non-zero values are shown
//System.out.println(p);             // Output: P1Y2M3D
//System.out.println(zero);          // Output: P0D

// Period.parse(CharSequence)
//Accepts format like "PnYnMnD" (case-insensitive)
//Period p2 = Period.parse("p2y3d");  // 2 years, 0 months, 3 days

// Note:
//- P, Y, M, D must be present in correct order
//- Zeros are ignored in toString() except when all are 0 (P0D)
