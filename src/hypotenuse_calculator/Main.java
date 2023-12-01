// Main class in a package of two classes that takes input from the
// user of two sides of a right-angled triangle and prints out the
// calculated hypotenuse of the triangle.
//-----------------------------------------------------------------//
package hypotenuse_calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the lengths of the sides
        System.out.print("Enter the length of side1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side2: ");
        double side2 = scanner.nextDouble();

        // Create an instance of HypotenuseCalculator
        HypotenuseCalculator calculator = new HypotenuseCalculator(side1, side2);

        // Calculate the hypotenuse using the HypotenuseCalculator method
        double hypotenuse = calculator.calculateHypotenuse();

        // Display the result
        System.out.println("The hypotenuse of the triangle is: " + hypotenuse);

        // Close the Scanner
        scanner.close();
    }
}

//-----------------------------------------------------------------//
// Input: side1 = 3.0, side2 = 4.0
// Output: The hypotenuse of the triangle is: 5.0