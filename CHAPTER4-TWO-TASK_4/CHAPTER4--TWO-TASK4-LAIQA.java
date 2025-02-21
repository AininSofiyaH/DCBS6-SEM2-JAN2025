package evenoddnum;
import java.util.Scanner;
public class EvenOddNum {
    public static void main(String[] args) {
        int num, choice, number, even = 0, odd = 0;
       Scanner numinput = new Scanner(System.in);
   
       do {
        System.out.print("Enter the number of integers in the sequence: ");
        num = numinput.nextInt();
        
        even = 0;
        odd = 0;
        
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
        
        System.out.print("Do you want to continue? (1 = yes, 0 = exit)): ");
        choice = numinput.nextInt();
       } while (choice == 1);
           
            System.out.println("Goodbye!");
             numinput.close();
       } 
   
}