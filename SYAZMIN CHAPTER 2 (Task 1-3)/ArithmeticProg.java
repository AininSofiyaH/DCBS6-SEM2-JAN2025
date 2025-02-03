import java.util.Scanner;

public class ArithmeticProg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter the first integer: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int b = scanner.nextInt();

        int sum = a + b;          
        int difference = a - b;   
        int product = a * b;     
        int quotient = (b != 0) ? a / b : 0;    

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        
        if (b != 0) {
            System.out.println("Division: " + quotient);
        } else {
            System.out.println("Division cannot be performed as the second integer is zero.");
        }

        scanner.close();
    }
}
