import java.util.Scanner;

public class testresult {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int students = test.nextInt();
        int passed = 0, failed = 0;

        System.out.println("Enter test results (1 for pass, 0 for fail):");
        for (int i = 0; i < students; i++) {
            int result = test.nextInt();
            if (result == 1) {
                passed++;
            } else {
                failed++;
            }
        }

        double passPercentage = ((double) passed / students) * 100;
        double failPercentage = ((double) failed / students) * 100;

        System.out.println("Passed: " + passed + " (" + passPercentage + "%)");
        System.out.println("Failed: " + failed + " (" + failPercentage + "%)");

        if (passPercentage > 50) {
            System.out.println("Bonus to instructor");
        }

        test.close();
    }
}
