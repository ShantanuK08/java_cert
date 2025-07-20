
package com.mis_test_nine;


import java.util.Arrays;


public class Test_12 {

    public static void main(String[] args) {

        // Sort the args array using Arrays.sort()
        // This is necessary because binarySearch requires the array to be in sorted order
        Arrays.sort(args);  

        // Perform a binary search for args[0] (the first element of the sorted args array)
        // Arrays.binarySearch() returns the index of the element if found (or a negative value if not found)
        // Since we are searching for args[0], and the array is already sorted, it will always be found at index 0
        int result = Arrays.binarySearch(args, args[0]);

        // Print the result of the binary search
        // Since we're searching for the first element in a sorted array, the result is always 0
        System.out.println(result); 
    }
}
