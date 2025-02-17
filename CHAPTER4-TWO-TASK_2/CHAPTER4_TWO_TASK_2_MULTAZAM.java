import java.util.Scanner;

public class CHAPTER4_TWO_TASK_2_MULTAZAM {
    public static void main(String[] args) {
        Scanner zam = new Scanner(System.in);

        // Tell user to enter the num. of students
        System.out.print("Number of students?: ");
        int student = zam.nextInt();

        // Initialise counter for pass and fail
        int pass = 0;
        int fail = 0;

        // Get students' score 
        for (int students = 1; students <= student; students++) {
            System.out.print("Enter mark for student " + students + ": ");
            int mark = zam.nextInt();

            // Determine whether they pass or not
            if (mark >= 40) {
                pass++;
            } else {
                fail++;
            }
        }

        // Update counter for those that pass or not
        System.out.println("Number of students who passed: " + pass);
        System.out.println("Number of students who failed: " + fail);

        // Check if more than 50% passed
        if (pass > student / 2) {
            System.out.println("Bonus to instructor");
        }
    }
}
