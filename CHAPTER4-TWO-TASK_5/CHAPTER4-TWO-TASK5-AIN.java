package multipleprogram;
import java.util.Scanner;
public class Multipleprogram {
    public static void main(String[] args) {
        Scanner program = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("Please choose any program to run :");
            System.out.println("1. Password System");
            System.out.println("2. Student Results");
            System.out.println("3. Even Odd Number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = program.nextInt();
            program.nextLine();
            
        switch (choice) {
            case 1:
                int option;
                String password;
                    do {
                   System.out.println("Enter your password : "); //minta user masukkan password
                   password = program.nextLine();
            
        //check kalau password tu betul
        if(password.equals("SPG0453")){
            System.out.println("Willkommen");
           
        }
        else
        //kalau password salah
        {
            System.out.println("Incorrect Password.. Attempts Left : ");
        
        //kalau attempts semua dah habis
        System.out.println("Access Denied!");}
        System.out.println("Enter 1 to try again, enter 0 to exit");
        option=program.nextInt();
                    } while (option==1);
                    break;
          case 2:
              int input;
              do {
          int numStudents;
          int passCount=0; //kira bilangan student yang lulus
        
        //bilangan pelajar
        System.out.print("Enter the number of Students : ");
        numStudents = program.nextInt();
        
        //loop untuk masukkan markah setiap students
        for(int i=0; i<numStudents; i++){
            System.out.print("Enter mark for Student" +(i+1) + ": ");
            if (program.nextInt()>= 50) passCount++; // markah >= 50, students lulus
            }
        //print bilangan students yang fail and lulus
        System.out.println("Pass : " +passCount+ " Fail : " +(numStudents-passCount));
        
        //check kalau >=50% student lulus
        if (passCount > numStudents / 2) 
            System.out.println("Bonus to Instructor"); //kalau lebih 50% pass
        else
            System.out.println("No bonus to Instructor"); //kalau kurang 50% yang pass
            System.out.println("Enter 1 to try again, enter 0 to exit");
            input = program.nextInt();
              }while (input==1);
        break;
                    
            case 3: 
            
            int evenNum, oddNum, choiceint;
 
 do {
     evenNum=0;
     oddNum=0;
     
     //minta user masukkan integers
     System.out.print("Enter the number of integers : ");
     int num = program.nextInt();
     
     //minta user masukkan sequence of integer
     System.out.println("Enter " + num + " integers : ");
     for(int i = 0; i<num; i++){
         int number = program.nextInt();
         
    //check kalau number odd atau even
    if(number % 2 == 0){
        evenNum++; }
    else {
        oddNum++;
    }
    
     }
     //display the result
     System.out.println("Number of even integers : " +evenNum);
     System.out.println("Number of odd integers : " +oddNum);
     
  
     
 
 
          System.out.print("Program exited.");
          System.out.println("Enter 1 to try again, enter 0 to exit.");
          choiceint = program.nextInt();
 }while (choiceint==1);
 break;
        
            case 4 : 
                System.out.println("Thank you for willing to try this system!");
                break;
            
            default:
                System.out.println("Invalid choice. Try again later.. ");
                   } 
        } while (choice !=  4); }}