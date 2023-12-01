// Java class that contains examples of the scanner class methods
//-----------------------------------------------------------------//
package code_examples;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading an integer
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        System.out.println("You entered: " + intValue);

        // Reading a double
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("You entered: " + doubleValue);

        // Reading a string
        System.out.print("Enter a string: ");
        scanner.nextLine();  // Consume the newline character left by nextDouble
        String stringValue = scanner.nextLine();
        System.out.println("You entered: " + stringValue);

        // Reading a character
        System.out.print("Enter a character: ");
        char charValue = scanner.next().charAt(0);
        System.out.println("You entered: " + charValue);

        scanner.close();
    }
}
