package q12time;

public class Q12Time  {
	/**
	* We need to write a Java class, namely Q12Time.java, which computes 
	* the angle between the hour hand and the minute hand on a traditional 
	* analogue clock. The angles are measured counterclockwise from hour 
	* to minute hand. The results are rounded and normalised so that 
	* it is between 0 and 359 (inclusively). 
	* The program is tested with the following times: 9:00, 3:00, 18:00, 
	* 1:00, 2:30, and 4:41 (with results 270 degrees, 90 degrees, 180 degrees, 
	* 30 degrees, 255 degrees, and 254 degrees).
	*/
    public static int calculateAngle(int hour, int minute) {
        // Normalize hours between 0 and 12.
        hour = hour % 12;

        // Calculate positions of the hour and minute hands.
        double hourPosition = (hour * 30) + (minute * 0.5);
        double minutePosition = minute * 6;

        // Calculate difference between two positions.
        double difference = hourPosition - minutePosition;

        // Normalize difference between 0 and 360.
        difference = (difference < 0) ? (360 + difference) : difference;

        // Round result and output as integer.
        return (int) Math.floor(difference);
    }

    public static void main(String[] args) {
        // Testing calculateAngle method with various times.
        System.out.println(calculateAngle(9, 0));   // Expected output: 270
        System.out.println(calculateAngle(3, 0));   // Expected output: 90
        System.out.println(calculateAngle(18, 0));  // Expected output: 180
        System.out.println(calculateAngle(1, 0));   // Expected output: 30
        System.out.println(calculateAngle(2, 30));  // Expected output: 255
        System.out.println(calculateAngle(4, 41));  // Expected output: 254
    }
}