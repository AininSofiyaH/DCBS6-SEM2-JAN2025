import java.util.Scanner;

public class ArithOp {
    public static void main(String[] args) {
        Scanner sif = new Scanner(System.in);
        double first, second, end;
        int operations;

        System.out.println("ArithOp menu: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Please enter your option: ");
        
        //baca option 
        operations = sif.nextInt();

        //calculation
        System.out.print("Enter first number: ");
        first = sif.nextDouble();
        System.out.print("Enter second number: ");
        second = sif.nextDouble();

        switch (operations) {
            case 1:
                end = first + second;
                System.out.println("Result: " + first + " + " + second + " = " + end);
                break;
            case 2:
                end = first - second;
                System.out.println("Result: " + first + " - " + second + " = " + end);
                break;                
            case 3:
                end = first * second;
                System.out.println("Result: " + first + " * " + second + " = " + end);
                break;
            case 4:
                end = first / second;
                    System.out.println("Result: " + first + " / " + second + " = " + end);
                break;
        }
        sif.close();
    }
}
