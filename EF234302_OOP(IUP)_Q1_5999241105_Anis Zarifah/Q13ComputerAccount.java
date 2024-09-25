package Q13ComputerAccount;

public class Q13ComputerAccount {
	/**
	* First, we need to define class Q13ComputerAccount and a constructor 
	* to create it. The computer account is built from three strings which are 
	* realName, userName, and password. It implements three methods which are
	* printRealName, printUserName, printPassword, and changePassword. 
	* The first three methods take no arguments. The last method takes one argument 
	* of type String, the new password, and sets the password to the new password; 
	* its return value is void.
	* The program is tested with Heath Storm as the real name, heathstorm as the
	* username, welcomedistrict as the password, and mikrokosmos as the new password.
	*/
	// Define your properties/fields here
    private String realName; // Stores real name of computer account
    private String userName; // Stores username of computer account
    private String password; // Stores password of computer account
   
    // Define your constructor here
    public Q13ComputerAccount(String realName, String userName, String password) {
        this.realName = realName; // Initialize realName variable with provided input
        this.userName = userName; // Initialize userName variable with provided input
        this.password = password; // Initialize password variable with provided input
    }
    
    // Define your getters and setters in here

    // Obtain computer account real name
    public String getRealName() {
        return realName;
    }
    
    // Set computer account real name
    public void setRealName(String realName) {
        this.realName = realName;
    }
    
    // Obtain computer account username
    public String getUserName() {
        return userName;
    }
       
    // Set computer account username
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    // Obtain computer account password
    public String getPassword() {
        return password;
    }
    
    // Set computer account password
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void printRealName() {
        System.out.println("Real Name: " + realName); // Print real name of computer account
    }
    
    public void printUserName() {
        System.out.println("Username: " + userName); // Print username of computer account
    }
    
    public void printPassword() {
        System.out.println("Password: " + password); // Print password of computer account
    }
    
    public void changePassword(String newPassword) {
        this.password = newPassword;
        System.out.println("New Password: " + password); // Change password of computer account to new password
    }
}
