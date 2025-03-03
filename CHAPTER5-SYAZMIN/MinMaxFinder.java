import java.util.Scanner;

public class MinMaxFinder {

    // Method to determine min and max values
    public static void evaluateExtremes(int a, int b, int c) {
        int highest = Math.max(a, Math.max(b, c));
        int lowest = Math.min(a, Math.min(b, c));

        System.out.println("Highest number: " + highest);
        System.out.println("Lowest number: " + lowest);
    }

    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);
        char proceed;

        do {
            // Collect three numbers from the user
            System.out.print("Input first value: ");
            int first = inputDevice.nextInt();

            System.out.print("Input second value: ");
            int second = inputDevice.nextInt();

            System.out.print("Input third value: ");
            int third = inputDevice.nextInt();

            // Determine the highest and lowest numbers
            evaluateExtremes(first, second, third);

            // Ask if the user wants another round
            System.out.print("Try another set? (Y/N): ");
            proceed = inputDevice.next().charAt(0);

        } while (proceed == 'Y' || proceed == 'y'); // Ensuring repeatability

        System.out.println("Exiting... Thanks for using this tool!");
        
        inputDevice.close();
    }
}
