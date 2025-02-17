import java.util.Scanner;

public class Chapter4Task2a2 {
    public static void main(String[] args) {
        Scanner marks = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int totalStudents = marks.nextInt();

        int passed = 0, failed = 0;

        for (int i = 1; i <= totalStudents; i++) {
            System.out.print("Enter result for Student " + i + " (1 for Pass, 0 for Fail): ");
            int result = marks.nextInt();

            if (result == 1) {
                passed++;
            } else if (result == 0) {
                failed++;
            } else {
                System.out.println("Invalid input. Please enter 1 for Pass or 0 for Fail.");
                i--; 
            }
                    
        }

        System.out.println("\nTotal Passed: " + passed);
        System.out.println("Total Failed: " + failed);

        if (passed > totalStudents / 2) {
            System.out.println("Bonus to instructor!");
        }

        
    }
}

