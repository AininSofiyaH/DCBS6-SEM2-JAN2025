package pkg3in1system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
           Scanner userinp = new Scanner(System.in);
        int choice;
        System.out.println("   @@@ Wilkommen! @@@");
        
        do { 
            System.out.println("Choose a program to run:");
            System.out.println("1. Password System");
            System.out.println("2. Student Results");
            System.out.println("3. Even Odd Number");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = userinp.nextInt();
            userinp.nextLine();
            
        switch (choice) {
            case 1:
                int option;
                String password;
                    do {
                        System.out.print("Welcome to the Password System!\n");
                        System.out.print("Enter password: ");
                        password = userinp.nextLine();
                        if (password.equals("programming123")) {
                            System.out.println("Access granted!");
                        } else {
                            System.out.println("Incorrect password.");
                        }
                        System.out.print("Enter 1 to try again, 0 to exit: \n");
                        option = userinp.nextInt();
                        userinp.nextLine();
                    } while (option == 1);
                    break;
               
                    
            case 2:
               int result, numstu, pass, fail;
               String choicetest;
                 do {
                     pass = 0; fail = 0;
                     System.out.print("Welcome to the Student Results System\n");
                     System.out.print("Enter the number of students: ");
                        numstu = userinp.nextInt();
    
                for (int a = 0; a < numstu; a++){
                    System.out.print("Enter result for student " + (a + 1) + " (passing marks = 50) : ");
                    result = userinp.nextInt();
        
                if (result > 50) {
                     pass++;}
                 else {fail++; }}
                
                 if (pass > numstu / 2) {
                    System.out.println("##Bonus to instructor##");}
                 else { System.out.println("No bonus to instructor");}
    
                    System.out.println("Number of students passed: " + pass);
                    System.out.println("Number of students failed: " + fail);
    
              System.out.println("Do you want to continue? (yes/no): ");
              userinp.nextLine();
                        choicetest = userinp.nextLine();
                        } while (choicetest.equals("yes") || choicetest.equals("Yes"));
                        break;
                    
            case 3: 
            int num, number, even, odd;
            char choicechar;
                do{
                    even = 0; odd =0;
                    System.out.print("Welcome to the Odd and Even Number System\n");
                    System.out.print("Enter the number of integers in the sequence: ");
                    num = userinp.nextInt();
        
                for (int i = 0; i < num; i++) {
                    System.out.print("Enter integer " + (i + 1) + ": ");
                    number = userinp.nextInt();
            
                    if (number % 2 == 0) {even++;
                        } else {odd++;}}
                System.out.println("Number of even integers: " + even);
                System.out.println("Number of odd integers: " + odd);
        
                System.out.print("Do you want to continue? (y for yes/n for no) \n");
                choicechar = userinp.next().charAt(0); // Read first character
                    } while (choicechar == 'y' || choicechar == 'Y');
                            break;
            
        
            case 4 : 
                System.out.println("Thank you for using this system! Goodbye! <3\n");
                break;
            
            default:
                System.out.println("###Invalid choice. Please try again!###\n");
                   } 
        } while (choice != 4); 
    }
    
}
