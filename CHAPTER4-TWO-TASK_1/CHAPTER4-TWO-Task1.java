package passwordsystem;
import java.util.Scanner;
public class Passwordsystem {
    public static void main(String[] args) {
        String username, input, password = "programming123"; //declare password
        int attempts = 2;
        Scanner userinp = new Scanner(System.in); //scanner
        
        System.out.print("Enter your username: "); //enter username
        username = userinp.nextLine(); 
    
    while (attempts > 0) { //selagi ada attempts, user boleh input password
       System.out.print("Enter password: ");
       input = userinp.nextLine();
       
       //password betul
       if (input.equals(password)) {
            System.out.println("Access granted!"); 
            userinp.close();
            return;       } 
       
       //password salah
       else {
            attempts--; //kurangkan attempts
            System.out.println("Incorrect password. Attempts left: " + attempts);
        }
    }
       System.out.println("Access denined!");
    
}}
