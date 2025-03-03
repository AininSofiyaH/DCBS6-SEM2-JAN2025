import java.util.Scanner;

public class GradeCalculator {

    // Method to determine grade based on marks
    public static char getGrade(int marks) {
        if (marks >= 80) return 'A';
        else if (marks >= 70) return 'B';
        else if (marks >= 60) return 'C';
        else if (marks >= 50) return 'D';
        else return 'E';
    }

    public static void main(String[] args) {
        Scanner meen = new Scanner(System.in);
        int[] marks = new int[10]; // Array to store 10 marks
        int gradeA = 0, gradeB = 0, gradeC = 0, gradeD = 0, gradeE = 0;

        // Loop to get 10 marks from the user
        System.out.println("Enter 10 marks:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter mark #" + (i + 1) + ": ");
            marks[i] = meen.nextInt();
            char grade = getGrade(marks[i]);

            // Count grades
            switch (grade) {
                case 'A': gradeA++; break;
                case 'B': gradeB++; break;
                case 'C': gradeC++; break;
                case 'D': gradeD++; break;
                case 'E': gradeE++; break;
            }
        }
        
        // Close meen
        meen.close();

        // Display results
        System.out.println("\nOut of 10:");
        System.out.println("Grade A: " + gradeA);
        System.out.println("Grade B: " + gradeB);
        System.out.println("Grade C: " + gradeC);
        System.out.println("Grade D: " + gradeD);
        System.out.println("Grade E: " + gradeE);
    }
}
