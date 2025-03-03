import java.util.Scanner;

public class MinMaxFinder {
    
    // User-defined method to find max and min
    public static void findMinMax(int num1, int num2, int num3) {
        int max = Math.max(num1, Math.max(num2, num3));
        int min = Math.min(num1, Math.min(num2, num3));

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }

    public static void main(String[] args) {
        Scanner meen = new Scanner(System.in);
        char choice;

        do {
            // User inputs three integers
            System.out.print("Enter first number: ");
            int num1 = meen.nextInt();

            System.out.print("Enter second number: ");
            int num2 = meen.nextInt();

            System.out.print("Enter third number: ");
            int num3 = meen.nextInt();

            // Call the method to find max and min
            findMinMax(num1, num2, num3);

            // Ask the user if they want to continue
            System.out.print("Do you want to enter another set of numbers? (Y/N): ");
            choice = meen.next().charAt(0);

        } while (Character.toUpperCase(choice) == 'Y'); // Loop if user inputs 'Y' or 'y'

        System.out.println("Program exited. Thank you!");
        meen.close();
    }
}
