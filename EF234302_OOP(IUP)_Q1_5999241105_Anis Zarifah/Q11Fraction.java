package q11fraction;

public class Q11Fraction {
	/**
	* In question no.1, e1 and d1 represent the fraction 𝑒1/𝑑1 and correspondingly 
	* e2 and d2 the fraction 𝑒2/𝑑2, where e1 and e2 are integers and d1 and d2 
	* are positive integers. 
	* We need to write a Java class, namely Q11Fraction.java, which computes 
	* numbers es, ds and ep, dp, which stand for the sum and the product 
	* of the two fractions. 
	* This problem is tested with 1/2+1/3, 1/3+3/4, 1/2∗2/3, and 1/4∗2/3.
	*/
// Add fractions
 public static void addFraction(int e1, int d1, int e2, int d2) {
     int es = e1 * d2 + e2 * d1; // Calculate numerator of the sum
     int ds = d1 * d2; // Calculate denominator of the sum
     System.out.println("Fractions sum: " + es + "/" + ds); // Output sum
 }

 // Multiply fractions
 public static void multiplyFraction(int e1, int d1, int e2, int d2) {
     int ep = e1 * e2; // Calculate numerator of the product
     int dp = d1 * d2; // Calculate denominator of the product
     System.out.println("Fractions product: " + ep + "/" + dp); // Output product
 }

 public static void main(String[] args) {
     // Test your class in here
     addFraction(1, 2, 1, 3); // 1/2 + 1/3
     addFraction(1, 3, 3, 4); // 1/3 + 3/4
     multiplyFraction(1, 2, 2, 3); // 1/2 * 2/3
     multiplyFraction(1, 4, 2, 3); // 1/4 * 2/3
 }
}
