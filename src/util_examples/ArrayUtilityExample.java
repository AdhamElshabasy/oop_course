// Java class that contains the methods in java.util.Arrays class
// with descriptions and how to use them
//-----------------------------------------------------------------//
package util_examples;

import java.util.Arrays;

public class ArrayUtilityExample {
    public static void main(String[] args) {
        // Sorting Arrays
        int[] numbers = {5, 2, 8, 1, 3};
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // Searching Arrays
        int index = Arrays.binarySearch(numbers, 3);
        System.out.println("Index of 3: " + index);

        // Comparing Arrays
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        boolean isEqual = Arrays.equals(arr1, arr2);
        System.out.println("Arrays are equal: " + isEqual);

        // Filling Arrays
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 42);
        System.out.println("Filled Array: " + Arrays.toString(filledArray));

        // Converting Arrays to Strings
        String arrayString = Arrays.toString(numbers);
        System.out.println("Array as String: " + arrayString);

        // Copying Arrays
        int[] original = {1, 2, 3};
        int[] copy = Arrays.copyOf(original, original.length);
        System.out.println("Copied Array: " + Arrays.toString(copy));

        // Comparing Arrays Element-wise
        int[][] arr2D1 = {{1, 2}, {3, 4}};
        int[][] arr2D2 = {{1, 2}, {3, 4}};
        boolean isEqual2D = Arrays.deepEquals(arr2D1, arr2D2);
        System.out.println("2D Arrays are equal: " + isEqual2D);
    }
}
