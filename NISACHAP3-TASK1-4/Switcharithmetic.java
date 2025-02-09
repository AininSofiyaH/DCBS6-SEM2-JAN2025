package switcharithmetic;
import java.util.Scanner;
public class Switcharithmetic {
    
    public static void main(String[] args) {
        int num1, num2;
    
        Scanner read = new Scanner (System.in);
        
        System.out.print("Please enter your first number: ");
        num1 = read.nextInt();
        
        System.out.print("Please enter your second number: ");
        num2 = read.nextInt();
        
        System.out.println("    Select your operation:  ");
        System.out.println("         1. Addition ");
        System.out.println("         2. Minus ");
        System.out.println("         3. Multiplication ");
        System.out.println("         4. Division ");
        System.out.println("         5. Modulus ");
        
        System.out.print("Please choose one of the above: ");
        int operations = read.nextInt();
        read.close();
    
		switch (operations) { 
			case 1: System.out.println("Answer: " +num1 + "+" +num2 + "=" +(num1+num2));break; 
			case 2: System.out.println("Answer: " +num1 + "-" +num2 + "=" +(num1-num2)); break; 
			case 3: System.out.println("Answer: " +num1 + "*" +num2 + "=" +(num1*num2)); break;
                        case 4: System.out.println("Answer: " +num1 + "/" +num2 + "=" +(num1/num2)); break;
                        case 5: System.out.println("Answer: " +num1 + "%" +num2 + "=" +(num1%num2)); break;
			default: System.out.println("Invalid number.");break;
    }
                        }  
}

