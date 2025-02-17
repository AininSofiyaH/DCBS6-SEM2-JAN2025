import java.util.Scanner;

public class CPT2A {
    public static void main (String[] args) {
    String CorrectPassword = "1234";
    int MaxAttempts = 5;
    
    
        Scanner scanner = new Scanner(System.in);
        int Attempts = 0;
        
        while (Attempts < MaxAttempts) {
            System.out.print("Enter password: ");
            String EnteredPassword = scanner.nextLine();
            
            
            if (EnteredPassword.equals(CorrectPassword)) {
                System.out.println("Password Correct. You may enter.\n\nYour data is loading...");
                break;
            } else {
                Attempts++;
                System.out.println("Incorrect password. You have " + (MaxAttempts - Attempts) + " attempts remaining.");
                
                if (Attempts == MaxAttempts) {
                    System.out.println("Maximum attempts exceedes. Your data is being erased.\njk");
                }
            }
        }
        
        scanner.close();
    }
}
