package evenoddnum;
import java.util.Scanner;
public class EvenOddNum {
    public static void main(String[] args) {
        int num, choice, number, even = 0, odd = 0;
       Scanner numinput = new Scanner(System.in);
   
       do {
        System.out.print("Enter the number of integers in the sequence: ");
        num = numinput.nextInt(); //for user to input bilangan nombor
        
        even = 0;
        odd = 0;
        
        for (int i = 0; i < num; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            number = numinput.nextInt(); // to input each number
            
            if (number % 2 == 0) { //nombor tu even kalau remainder dia 0 after bahagi dgn 2
                even++; 
            } else { // kalau tak odd lah
                odd++;
            }
        }
        
        System.out.println("Number of even integers: " + even);
        System.out.println("Number of odd integers: " + odd);
        
        System.out.print("Do you want to continue? (1 = yes, 0 = exit)): "); // let user decide if they want to continue or exit
        choice = numinput.nextInt();
       } while (choice == 1); //loop - the system will run again if user input 1
           
            System.out.println("Goodbye!"); 
             numinput.close();
       } 
   
}
