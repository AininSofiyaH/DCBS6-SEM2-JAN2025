import java.util.Scanner;

public class ArithmeticProg {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Insert your first number: ");
        int num1 = read.nextInt();

        System.out.print("Insert your second number: ");
        int num2 = read.nextInt();

        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Minus: " + (num1 - num2));
        System.out.println("Division: " + (num1 * num2));
        System.out.println("Times: " + (num1 / num2));
        System.out.println("Remainder: " + (num1 % num2));

        read.close();
    }
}
