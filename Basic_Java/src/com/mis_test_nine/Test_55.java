
package com.mis_test_nine;

public class Test_55 {

    /**
     * A static method that performs a deep copy of an integer array.
     * Static: Because it's being called from a static main method.
     * Input: int[] anArray — an integer array
     * Output: int[] — a new integer array (copied)
     */
    public static int[] copyArray(int[] anArray) {
        // Create a new int array 'temp' with the same length as 'anArray'
        int[] temp = new int[anArray.length];

        // Copy each element from the input array to the new array
        for (int i = 0; i < anArray.length; i++) {
            temp[i] = anArray[i];  // Element-by-element copy
        }

        // Return the new copied array
        return temp;
    }

    /**
     * The main method: Java program starts execution here.
     * String[] args — command-line arguments (not used in this program)
     */
    public static void main(String[] args) {

        // Declare and initialize an integer array 'original' with 5 values
        int[] original = {1, 2, 3, 4, 5};

        // Call copyArray() to make a copy of 'original' and store it in 'copied'
        int[] copied = copyArray(original);  // deep copy, not just reference

        // Print the original array elements
        System.out.print("Original array: ");  // print heading
        for (int num : original) {             // enhanced for loop (num = each value)
            System.out.print(num + " ");       // print each number followed by space
        }

        System.out.println(); // Move to the next line after printing original array

        // Print the copied array elements
        System.out.print("Copied array:   ");   // print heading
        for (int num : copied) {                // same logic as above
            System.out.print(num + " ");
        }

        // Modify the first element of the original array to prove it's a deep copy
        original[0] = 100;

        // Notify user about the change
        System.out.println("\n\nAfter modifying original array:");

        // Print modified original array
        System.out.print("Original array: ");
        for (int num : original) {
            System.out.print(num + " ");
        }

        System.out.println();  // line break

        // Print copied array again to show it is unchanged
        System.out.print("Copied array:   ");
        for (int num : copied) {
            System.out.print(num + " ");
        }
    }
}
