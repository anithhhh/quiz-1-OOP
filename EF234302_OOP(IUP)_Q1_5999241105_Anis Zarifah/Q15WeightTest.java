package Q15WeightTest; 

import Q15Weight.Q15Weight; // Import the Q15Weight class

public class Q15WeightTest {
    /**
     * This program is made to verify if the weight in pounds is converted correctly
     * into kilograms with the correct value. It is tested with 10 pounds as
     * the weight that needs to be converted into kilograms.
     */
    public static void main(String[] args) {
        // Make a new instance of Q15Weight with provided input  
        Q15Weight weight = new Q15Weight(10.0);
        
        // Print weight in pounds
        System.out.println("Weight in pounds: " + weight.getPounds());
        
        // Print weight in kilograms
        System.out.println("Weight in kilograms: " + weight.getKilograms());
    }
}
