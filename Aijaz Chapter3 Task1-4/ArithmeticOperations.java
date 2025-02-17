import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = read.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = read.nextDouble();

        System.out.println("Choose operator: +, -, *, /");
        char operator = read.next().charAt(0);
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Divisor by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator.");
                return;
        }

        System.out.println("Hasil: " + result);
        read.close();
    }
}