package maxminnumber;
import java.util.Scanner;

public class Maxminnumber {

     public static void main(String[] args) {
        Scanner userinp = new Scanner(System.in);
        char choice; 
        do {
            double num1, num2, num3;

            // Getting input from the user
            System.out.print("Enter first number: ");
            num1 = userinp.nextDouble();
            System.out.print("Enter second number: ");
            num2 = userinp.nextDouble();
            System.out.print("Enter third number: ");
            num3 = userinp.nextDouble();

            // Finding max and min values
            double max = maximum(num1, num2, num3);
            double min = minimum(num1, num2, num3);

            // Displaying the results
            System.out.println("Maximum value: " + max);
            System.out.println("Minimum value: " + min);

            // Asking the user if they want to continue
            System.out.print("Do you want to continue? (Y/N): ");
            choice = userinp.next().charAt(0);

        } while (choice == 'Y' || choice == 'y'); // Loop continues if user enters 'Y' or 'y'

        System.out.println("Exited. Thank you for using this system.!");
        userinp.close();}

    // Method to find maximum number
    public static double maximum(double a, double b, double c) {
        return Math.max(a, Math.max(b, c));
    }

    // Method to find minimum number
    public static double minimum(double a, double b, double c) {
        return Math.min(a, Math.min(b, c));
    } 
}
    
