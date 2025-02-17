import java.util.Scanner;

public class StudentPassFailChecker {
    public static void main(String[] args) {
        Scanner Studentin = new Scanner(System.in);

        // Prompt user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = Studentin.nextInt();

        // Check for invalid input (negative or zero number of students)
        if (numberOfStudents <= 0) {
            System.out.println("Invalid number of students.");
            return;
        }

        int passedCount = 0; // Counter for students who passed
        int failedCount = 0; // Counter for students who failed

        // Loop to collect test results for each student
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter result for student " + i + " (pass/fail): ");
            String result = Studentin.next().toLowerCase(); // Convert input to lower case for consistency

            // Check if the student passed
            if (result.equals("pass")) {
                passedCount++;
            } 
            // Check if the student failed
            else if (result.equals("fail")) {
                failedCount++;
            } 
            // Handle invalid input
            else {
                System.out.println("Invalid result. Please enter either 'pass' or 'fail'.");
                i--; // Decrement the counter to repeat the entry for the same student
            }
        }

        // Display the number of students and the pass/fail counts
        System.out.println("Total students: " + numberOfStudents);
        System.out.println("Number of students who passed: " + passedCount);
        System.out.println("Number of students who failed: " + failedCount);

        // Check if more than 50% of students passed and display a bonus message if true
        if (passedCount > (numberOfStudents / 2)) {
            System.out.println("Bonus to instructor");
        }

        // Close the scanner to release resources
        Studentin.close();
    }
}

