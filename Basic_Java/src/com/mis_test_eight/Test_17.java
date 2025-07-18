package com.mis_test_eight;


import java.util.Arrays;

public class Test_17 {

    public static void main(String[] fruits){
    // 'public' - method is accessible from anywhere.
    // 'static' - means the method belongs to the class, not an object of the class.
    // 'void' - method doesn't return any value.
    // 'main' - special method where execution begins.
    // 'String[] fruits' - array of Strings passed as command-line arguments (but unused here).

        String[] mew = new String[] { "Cherry","zzz", "Lime", "Orange" };
        // Declares and initializes a String array named 'mew'.
        // 'String[]' is the data type (an array of Strings).
        // 'new String[] {...}' is used to explicitly create a new String array with the given values.

        Arrays.sort(mew);
        // Calls Arrays.sort() to sort the array alphabetically (lexicographically).
        // Java sorts Strings based on Unicode values.
        // Final sorted array: { "Cherry", "Lime", "Orange", "zzz" }

        System.out.println(mew[0]+"  "+mew[1]+"  "+mew[2]+"  "+mew[3]);
        // Prints the sorted array elements with spacing.
        // Output: Cherry  Lime  Orange  zzz

        System.out.println(Arrays.binarySearch(mew,"zzz"));
        // Searches for the index of "zzz" using binary search in the sorted array.
        // 'Arrays.binarySearch()' returns index of the element if found, else a negative number.
        // Output: 3, since "zzz" is at index 3 after sorting.

    }
}
