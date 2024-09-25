package Q14ComplexNumber;

public class Q14ComplexNumber {
    /**
     * The Q14ComplexNumber class represents a complex number with real and imaginary parts.
     * It provides methods to perform addition, subtraction, and multiplication with other complex numbers.
     * It also provides a method to convert the complex number to a string in the form "a + bi".
     */

    // Define your properties/fields here
    private double real;      // Real part of the complex number
    private double imaginary; // Imaginary part of the complex number

    // Define your constructor here
    public Q14ComplexNumber(double real, double imaginary) {
        this.real = real;           // Initialize the real part
        this.imaginary = imaginary; // Initialize the imaginary part
    }

    // Getter method to retrieve the real part
    public double getReal() {
        return real;
    }

    // Getter method to retrieve the imaginary part
    public double getImaginary() {
        return imaginary;
    }

    // Method to add two complex numbers
    public Q14ComplexNumber add(Q14ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new Q14ComplexNumber(newReal, newImaginary);
    }

    // Method to subtract two complex numbers
    public Q14ComplexNumber subtract(Q14ComplexNumber other) {
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new Q14ComplexNumber(newReal, newImaginary);
    }

    // Method to multiply two complex numbers
    public Q14ComplexNumber multiply(Q14ComplexNumber other) {
        double newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        double newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Q14ComplexNumber(newReal, newImaginary);
    }

    // Method to convert the complex number to a string in the form "a + bi"
    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}

