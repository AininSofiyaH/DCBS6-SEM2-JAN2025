package password;
import java.util.Scanner;
public class Password {
public static void main(String[] args) {    
    Scanner read = new Scanner(System.in);
    String password = "wiege"; //password setting//
    int attempt_count = 3;//number of attempts//
    
    System.out.println("Only Authorized Access Allowed");
        while (attempt_count > 0) { 
                	System.out.print("Please enter the password: " );
        String entpassword = read.nextLine();//read user input of password//
        
        if (entpassword.equals(password)){
            System.out.println("Access allowed!");break;
        }else{
            attempt_count = attempt_count-1;
            if (attempt_count>0){
                System.out.println("INCORRECT PASSWORD!\nAttempts left : " +attempt_count);
            }else{
                System.out.print("Too many failed attempts.Access deniied.");
            read.close();
            }
        }
    }   
}}
