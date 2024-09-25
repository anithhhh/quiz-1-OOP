package Q16FractionTest; // Ensure this matches the directory structure

import Q16Fraction.Q16Fraction; // Import Q16Fraction if it's in a different package

public class Q16FractionTest {
    /**
     * This program tests the Q16Fraction class to verify the correct string representation,
     * sum, and product of fractions according to the inputs. It is tested with:
     * Q16Fraction f1 = new Q16Fraction(1, 2)
     * Q16Fraction f2 = new Q16Fraction(3, 7)
     * f1.toString(); which returns the string "1/2"
     * System.out.print(f2.getProduct(f1)); that should output 3/14, which is the 
     * product of f2 and f1
     * System.out.print(f2.getSum(f1)); that should output 13/14, which is the sum 
     * of f2 and f1
     */
    public static void main(String[] args) {
        // Create two instances of Q16Fraction with different numerators and denominators
        Q16Fraction f1 = new Q16Fraction(1, 2);
        Q16Fraction f2 = new Q16Fraction(3, 7);

        // Print the string representation of f1
        System.out.println("Fraction f1: " + f1.toString()); // Output: 1/2

        // Print the product of f2 and f1
        System.out.println("Product of f2 and f1: " + f2.getProduct(f1)); // Output: 3/14

        // Print the sum of f2 and f1
        System.out.println("Sum of f2 and f1: " + f2.getSum(f1)); // Output: 13/14
    }
}

