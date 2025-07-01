package com.mis_test_four;

public class TestCounter_46 {
    public static void main(String[] args) {

        //  Array of Counter_46 references (all nulls by default)
        Counter_46[] arr = new Counter_46[2];

        // Looping through null elements — no NullPointerException
        for (Counter_46 ctr : arr) {
            // 'count' is static → resolved as Counter_46.count
            System.out.print(ctr.count); // Prints: 10 10
        }

        
    }
}
