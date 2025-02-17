import java.util.Scanner;

public class PasswordSystem {
    public static void main(String[] args) {
        String Password = "kali"; // Change the password to your own pass
        int MAx_Attempts = 3; //Bilangan max utk attemps
        int attempts = 0; //Current number of attempts
        Scanner meen = new Scanner(System.in); //This Code for use User Input
        
        System.out.println("=== Small Password System using Java ==="); //Banner

        while (attempts < MAx_Attempts) {           //While Loop
            System.out.print("Enter your password: ");
            String userInput = meen.nextLine();
            
            if (userInput.equals(Password)) {
                System.out.println("Access Granted! Welcome to Mobile Legends");
                meen.close();
                return;
            } else {
                attempts++; //Unary Operator
                System.out.println("Incorrect password!\nAttempts left: " + (MAx_Attempts - attempts) + "\n");
            }
        }

        System.out.println("Too many failed attempts!!! Access Denied X");
        meen.close(); //Closed Scanner
    }
}
