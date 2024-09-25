
package Q13ComputerAccountTest;

//Import the Q13ComputerAccount class from its package
import Q13ComputerAccount.Q13ComputerAccount;

public class Q13ComputerAccountTest {
 /**
  * This class tests the functionality of the Q13ComputerAccount class,
  * including printing the real name, username, password, and changing the password.
  */
 public static void main(String[] args) {
     // Create an instance of Q13ComputerAccount
     Q13ComputerAccount account = new Q13ComputerAccount("Alia Ali", "aliali", "alia1234");
     
     // Print the real name, username, and password
     account.printRealName();     // Expected output: "Real Name: Alia Ali"
     account.printUserName();     // Expected output: "Username: aliali"
     account.printPassword();     // Expected output: "Password: alia1234"
     
     // Change the password to a new one and print it
     account.changePassword("mikrokosmos");  // Expected output: "New Password: ali12234"
     
     // Verify that the password has been updated
     account.printPassword();     // Expected output: "Password: ali1234"
 }
}
