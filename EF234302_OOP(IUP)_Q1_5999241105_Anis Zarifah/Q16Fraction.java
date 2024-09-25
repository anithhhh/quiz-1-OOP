package Q16Fraction;

public class Q16Fraction {
    /**
     * Fractions are represented by the Java class Q16Fraction. We define the class,
     * which in addition to the constructor and the accessor methods getNumerator
     * and getDenominator has methods toString (to print a rational number)
     * as well as getSum and getProduct, which generate the sum and the
     * product of fractions and return the corresponding object of Class Q16Fraction.
     */
    
    // Define your properties/fields here
    private int numerator;   // Denotes fraction numerator
    private int denominator; // Denotes fraction denominator

    // Define your constructor here
    public Q16Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify(); // Simplify the fraction on creation
    }

    // Accessor method to obtain the fraction numerator
    public int getNumerator() {
        return numerator;
    }

    // Accessor method to obtain the fraction denominator
    public int getDenominator() {
        return denominator;
    }

    // Convert the fraction to its string representation
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Method to obtain the sum of two fractions
    public Q16Fraction getSum(Q16Fraction other) {
        int sumNumerator = (this.numerator * other.denominator) + (other.numerator * this.denominator);
        int sumDenominator = this.denominator * other.denominator;
        return new Q16Fraction(sumNumerator, sumDenominator);
    }

    // Method to obtain the product of two fractions
    public Q16Fraction getProduct(Q16Fraction other) {
        int productNumerator = this.numerator * other.numerator;
        int productDenominator = this.denominator * other.denominator;
        return new Q16Fraction(productNumerator, productDenominator);
    }

    // Helper method to simplify the fraction
    private void simplify() {
        int gcd = findGCD(Math.abs(numerator), Math.abs(denominator));
        this.numerator /= gcd;
        this.denominator /= gcd;

        // Ensure the denominator is always positive
        if (this.denominator < 0) {
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;
        }
    }

    // Helper method to find the greatest common divisor (GCD)
    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
