package testbonus;
import java.util.Scanner;
public class Testbonus {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int numStudents;
        int passed = 0, failed = 0;

        System.out.print("Enter the number of students: ");
        numStudents = read.nextInt();

        if (numStudents > 0) {
            for (int i = 0; i < numStudents; i++) {
                int result;
                    System.out.print("Enter result for student " + (i + 1) + " (1 = pass, 2 = fail): ");
                    result = read.nextInt();
                    
        if (result == 1) {
            passed++;}
            
        else {
            failed++;
                }
            }
            System.out.println("Number of students who passed: " + passed);
            System.out.println("Number of students who failed: " + failed);

            if (passed > numStudents / 2) {
                System.out.println("Bonus to instructor!");
            }
        } else {
            System.out.println("Invalid number of students. The number should be greater than 0.");
        }

        read.close();
    }}
