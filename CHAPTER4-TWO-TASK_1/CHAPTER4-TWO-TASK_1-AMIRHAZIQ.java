import java.util.Scanner;

public class Chapter4Task2a {
    public static void main(String[] args) {
        Scanner password = new Scanner(System.in);
        
        String correctPassword = "1234";
        int maxAttempts = 3;
        int attempt = 0;
        
        while (attempt < maxAttempts) {
          System.out.print("Enter your password: ");
          String userInput = password.nextLine();
          
          if (userInput.equals(correctPassword)) {
              System.out.println("Access Granted");
              break;
          }else{
              attempt++;
              System.out.println("Incorrect password. Remaing attempts : " + (maxAttempts - attempt));
          }
          if (attempt == maxAttempts) {
              System.out.println("Too many failed attempts. Access Denied.");
          }
          }
        }
                
        
    }

