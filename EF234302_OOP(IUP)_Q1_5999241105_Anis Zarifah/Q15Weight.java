package Q15Weight;

public class Q15Weight {
    /**
     * This class deals with weights given in pounds and allows conversion 
     * to kilograms. The conversion rate provided is: 1 pound = 0.45359237 kilograms.
     */

    // Define the field to store weight in pounds
    private double pounds; // Stores weight in pounds

    // Constructor that initializes the weight with the provided value in pounds
    public Q15Weight(double p) {
        this.pounds = p; // Set the weight in pounds
    }

    // Method to get the weight in pounds
    public double getPounds() {
        return pounds;
    }

    // Method to convert the weight from pounds to kilograms
    public double getKilograms() {
        return pounds * 0.45359237;
    }

    // Optional: Override the toString method to provide a string representation
    @Override
    public String toString() {
        return pounds + " pounds (" + getKilograms() + " kg)";
    }
}

