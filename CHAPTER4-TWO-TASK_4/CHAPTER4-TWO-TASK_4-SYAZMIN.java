package countEvenOdd;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, totalNumbers;
        char choice;
        Scanner task4 = new Scanner(System.in); // Renamed Scanner to task4

        do {
            int evenCount = 0, oddCount = 0;

            System.out.print("Enter the number of integers in the sequence: ");
            totalNumbers = task4.nextInt();

            System.out.println("Enter " + totalNumbers + " integer numbers:");
            for (int i = 0; i < totalNumbers; i++) {
                num = task4.nextInt();
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            System.out.println("Number of even numbers: " + evenCount);
            System.out.println("Number of odd numbers: " + oddCount);

            System.out.print("Do you want to try again? (y/n): ");
            task4.nextLine(); // Consume the newline character
            choice = task4.nextLine().charAt(0);
        } while (choice == 'y' || choice == 'Y'); // Accepts both lowercase and uppercase 'y'

        System.out.println("Program terminated.");
        task4.close();
    }
}
