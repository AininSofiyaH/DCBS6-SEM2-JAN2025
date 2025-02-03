import java.util.Scanner;

public class ArithmeticOps {

    public static void main(String[] args) {
        Scanner AO = new Scanner(System.in);
        
        System.out.println("Choose an arithmetic operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        
        System.out.print("Enter choice (1/2/3/4): ");
        int choice = AO.nextInt();
        
        System.out.print("Enter first number: ");
        double num1 = AO.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = AO.nextDouble();
        
        double result;
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error!");
                }
                break;
            default:
                System.out.println("Invalid.");
        }
        
        AO.close();
    }
}
