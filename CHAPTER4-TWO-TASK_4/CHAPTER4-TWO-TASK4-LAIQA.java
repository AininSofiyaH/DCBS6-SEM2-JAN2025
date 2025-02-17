package evenoddnum;
import java.util.Scanner;
public class EvenOddNum {
    public static void main(String[] args) {
        int num, number, even = 0, odd = 0;
        String choice;
       Scanner numinput = new Scanner(System.in);
   
        System.out.print("Enter the number of integers in the sequence: ");
        num = numinput.nextInt();
        
        for (int i = 0; i < num; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            number = numinput.nextInt();
            
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        
        System.out.println("Number of even integers: " + even);
        System.out.println("Number of odd integers: " + odd);
        
        System.out.print("Do you want to continue? (yes/no): ");
        choice = numinput.next();
        if (choice == ("yes")) {
        }
        else {
            System.out.println("Goodbye!");
             numinput.close();
        }
    }
    
   
}