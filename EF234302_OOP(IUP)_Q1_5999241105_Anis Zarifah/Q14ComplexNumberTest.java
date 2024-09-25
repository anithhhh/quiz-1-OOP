package Q14ComplexNumberTest;

// Import the Q14ComplexNumber class from its package
import Q14ComplexNumber.Q14ComplexNumber;

public class Q14ComplexNumberTest {
    /**
     * This class tests the functionality of the Q14ComplexNumber class,
     * including addition, subtraction, multiplication, and string representation
     * of complex numbers.
     */
    
    public static void main(String[] args) {
        // Create two instances of Q14ComplexNumber
        Q14ComplexNumber c1 = new Q14ComplexNumber(3, 4); // Represents 3 + 4i
        Q14ComplexNumber c2 = new Q14ComplexNumber(1, 2); // Represents 1 + 2i

        // Display the string representation of the two complex numbers
        System.out.println("Complex Number 1: " + c1.toString()); // Expected Output: "3 + 4i"
        System.out.println("Complex Number 2: " + c2.toString()); // Expected Output: "1 + 2i"

        // Test addition
        Q14ComplexNumber sum = c1.add(c2);
        System.out.println("Sum: " + sum); // Expected Output: "4 + 6i"

        // Test subtraction
        Q14ComplexNumber difference = c1.subtract(c2);
        System.out.println("Difference: " + difference); // Expected Output: "2 + 2i"

        // Test multiplication
        Q14ComplexNumber product = c1.multiply(c2);
        System.out.println("Product: " + product); // Expected Output: "-5 + 10i"
    }
}
