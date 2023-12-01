// Java class that takes input of two double values through its
// constructor and returns a calculated hypotenuse of a triangle
// Using the Pythagorean theorem.
//-----------------------------------------------------------------//
package hypotenuse_calculator;

// HypotenuseCalculator.java
public class HypotenuseCalculator {
    private double side1;
    private double side2;

    // Constructor to initialize the sides
    public HypotenuseCalculator(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    // Method to calculate the hypotenuse
    public double calculateHypotenuse() {
        // Using the Pythagorean theorem: c = sqrt(a^2 + b^2)
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
}

//-----------------------------------------------------------------//
// Code doesn't print an output, but returns a value.
// Return: Double value of the calculated hypotenuse
