package arithmeticoperation;
import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
   
        int num1, num2, choice, ans = 0;
        Scanner numinput = new Scanner(System.in); 
        
        System.out.println("Enter 1st Integer: ");
        num1 = numinput.nextInt(); 
        
        System.out.println("Enter 2nd Integer: ");
        num2 = numinput.nextInt();
        
        System.out.println("1. Addition\n 2.Subtraction\n 3.Multplication\n 4.Division\n 5.Remainder");
        System.out.println("Choose your operation :");
        choice = numinput.nextInt();
        numinput.close();
       
        switch (choice) { 
			case 1: ans = num1+num2; break; 
			case 2: ans = num1-num2; break; 
			case 3: ans = num1*num2; break; 
			case 4: ans = num1/num2; break; 
                        case 5: ans = num1%num2; break;
			default: System.out.println("ERROR");break; } 
        
        System.out.println("Your answer is " + ans );
        
        
        
        
    }
    
}
