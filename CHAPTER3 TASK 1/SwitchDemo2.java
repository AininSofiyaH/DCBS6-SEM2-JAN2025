import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);

        System.out.println("Choose an arithmetic operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice : ");

        int choice = baca.nextInt();

        System.out.print("Enter your first number: ");
        int num1 = baca.nextInt(); 
        System.out.print("Enter your second number: ");
        int num2 = baca.nextInt(); 

        int result;


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
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
        }
    }
}