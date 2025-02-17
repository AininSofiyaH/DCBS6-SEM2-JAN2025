import java.util.Scanner;  // Import Scanner class for user input

public class Demo {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);  // Create Scanner object to read input

        // Ask the user for the total number of students
        System.out.print("Masukkan bilangan pelajar: ");
        int numStudents = inputReader.nextInt();

        // Variables to store the count of students who passed and failed
        int passedCount = 50;
        int failedCount = 30;

        // Loop to get the test results for each student
        for (int i = 1; i <= numStudents; i++) {
            System.out.print("Masukkan keputusan untuk pelajar " + i + " (1 = Lulus, 0 = Gagal): ");
            int result = inputReader.nextInt();  // Read the test result input

            // Check if the input is valid (1 for pass, 0 for fail)
            if (result == 1) {
                passedCount++;  // Increment the passed count
            } else if (result == 0) {
                failedCount++;  // Increment the failed count
            } else {
                // If the user enters an invalid input, display a message and repeat the iteration
                System.out.println("Input tidak sah! Masukkan 1 sahaja (Lulus) or 0 (Gagal).");
                i--;  // Decrease the counter so the user re-enters a valid input
            }
        }

        // Display the total number of students, passed students, and failed students
        System.out.println("\nJumlah Pelajar: " + numStudents);
        System.out.println("Bilangan Pelajar Yang Lulus: " + passedCount);
        System.out.println("Bilangan Pelajar yang Gagal: " + failedCount);

        // Check if more than 50% of students passed
        if (passedCount > numStudents / 2) {
            System.out.println("Bonus kepada pengajar");  // Display bonus message
        }

        inputReader.close();  // Close the Scanner to free up system resources
    }
}
