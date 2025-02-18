package integerscounter;
import java.util.Scanner;
public class Integerscounter {
 public static void main(String[] args) {
 Scanner integer = new Scanner(System.in);
 String choice;
 int evenNum, oddNum;
 
 do {
     evenNum=0;
     oddNum=0;
     
     //minta user masukkan integers
     System.out.print("Enter the number of integers : ");
     int num = integer.nextInt();
     
     //minta user masukkan sequence of integer
     System.out.println("Enter " + num + " integers : ");
     for(int i = 0; i<num; i++){
         int number = integer.nextInt();
         
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
     
     //tanya user if nak continue or exit
     System.out.println("Do you want to continue? (y/n): ");
     choice=integer.next();
     
 }while(choice.charAt(0) == 'Y' || choice.charAt(0) == 'y');
 
 System.out.print("Program exited.");
 integer.close();

 }
    }
    

