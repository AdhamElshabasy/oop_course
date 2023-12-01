// Java class that contains examples of Java Arrays
//-----------------------------------------------------------------//
package code_examples;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // 1. Single-dimensional array
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Single-dimensional array: " + Arrays.toString(intArray));

        // 2. Multi-dimensional array
        int[][] multiArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Multi-dimensional array:");
        for (int[] row : multiArray) {
            System.out.println(Arrays.toString(row));
        }

        // 3. String array
        String[] stringArray = {"Java", "C", "Python"};
        System.out.println("String array: " + Arrays.toString(stringArray));

        // 4. Object array
        Object[] objectArray = {1, "Hello", 3.14, true};
        System.out.println("Object array: " + Arrays.toString(objectArray));

        // 5. Initialize Empty Arrays
        int[] emptyIntArray = new int[0];
        String[] emptyStringArray = new String[0];
        double[] emptyDoubleArray = new double[0];

        System.out.println("Empty int array (before filling): " + Arrays.toString(emptyIntArray));
        System.out.println("Empty String array (before filling): " + Arrays.toString(emptyStringArray));
        System.out.println("Empty double array (before filling): " + Arrays.toString(emptyDoubleArray));

        // Fill Empty Arrays
        emptyIntArray = new int[]{10, 20, 30};
        emptyStringArray = new String[]{"Java", "C", "Python"};
        emptyDoubleArray = new double[]{3.14, 2.718};

        System.out.println("Filled int array: " + Arrays.toString(emptyIntArray));
        System.out.println("Filled String array: " + Arrays.toString(emptyStringArray));
        System.out.println("Filled double array: " + Arrays.toString(emptyDoubleArray));
    }
}
