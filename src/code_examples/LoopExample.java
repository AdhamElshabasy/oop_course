// Java class that contains examples of Java Loops
//-----------------------------------------------------------------//
package code_examples;

public class LoopExample {
    public static void main(String[] args) {
        // 1. For loop
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. Enhanced for loop (for-each)
        System.out.println("Enhanced for loop:");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 3. While loop
        System.out.println("While loop:");
        int count = 1;
        while (count <= 5) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();

        // 4. Do-while loop
        System.out.println("Do-while loop:");
        int doCount = 1;
        do {
            System.out.print(doCount + " ");
            doCount++;
        } while (doCount <= 5);
    }
}
