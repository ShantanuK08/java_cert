package com.mis_test_nine;


	public class Test_55 {

	    // Method to copy an array element-by-element (deep copy)
	    public static int[] copyArray(int[] anArray) {
	        int[] temp = new int[anArray.length];
	        for (int i = 0; i < anArray.length; i++) {
	            temp[i] = anArray[i];
	        }
	        return temp;
	    }

	    public static void main(String[] args) {
	        int[] original = {1, 2, 3, 4, 5};
	        int[] copied = copyArray(original);

	        // Print original array
	        System.out.print("Original array: ");
	        for (int num : original) {
	            System.out.print(num + " ");
	        }

	        System.out.println();

	        // Print copied array
	        System.out.print("Copied array:   ");
	        for (int num : copied) {
	            System.out.print(num + " ");
	        }

	        // Change original to prove it's a copy
	        original[0] = 100;

	        System.out.println("\n\nAfter modifying original array:");
	        System.out.print("Original array: ");
	        for (int num : original) {
	            System.out.print(num + " ");
	        }

	        System.out.println();
	        System.out.print("Copied array:   ");
	        for (int num : copied) {
	            System.out.print(num + " ");
	        }
	    }
	}
