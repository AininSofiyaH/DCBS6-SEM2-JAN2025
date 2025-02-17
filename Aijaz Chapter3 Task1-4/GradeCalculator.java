import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Enter the student's final mark (0-100): ");
        int mark = read.nextInt();

        String grade;

        if (mark >= 90 && mark <= 100) {
            grade = "A";
        } else if (mark >= 80) {
            grade = "B";
        } else if (mark >= 70) {
            grade = "C";
        } else if (mark >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n--- Final Grade ---");
        System.out.println("Mark: " + mark);
        System.out.println("Grade: " + grade);

        read.close();
    }
}
