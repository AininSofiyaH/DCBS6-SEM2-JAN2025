package evodtask4;
import java.util.Scanner;
public class Evodtask4 {
    public static void main(String[] args) {
        int num, value, even=0, odd=0;
        String option;
        Scanner roll = new Scanner(System.in);
        
        do{
            even=0;
            odd=0;
    
            System.out.println("How many integers would you like to enter?");
            num = roll.nextInt();
            
            System.out.println("Enter the integers: ");
            for (int count=0;count<num;count++){
                value = roll.nextInt();
                if (value%2==0){
                    even++;
                }else{
                    odd++;
                }
            }
            System.out.println("Number of even numbers: " +even);
            System.out.println("Number of odd number: " +odd);
            System.out.println("Would you like to enter another sequence?(yes/no): ");
            option=roll.next();
            
        if(option.equalsIgnoreCase("no")){
            System.out.println("Thank you for using this program!Program exited.");break;
        }
    }while(true);
        roll.close();
    }}
