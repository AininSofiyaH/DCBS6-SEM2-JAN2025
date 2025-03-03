import java.util.Scanner;

public class GradeCalculator {

    // Method to evaluate grades based on marks
    public static char determineGrade(int score) {
        if (score >= 80) return 'A';
        else if (score >= 70) return 'B';
        else if (score >= 60) return 'C';
        else if (score >= 50) return 'D';
        else return 'E';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scores = new int[10]; // Array to store 10 scores
        int countA = 0, countB = 0, countC = 0, countD = 0, countE = 0;

        // Gathering scores from user
        System.out.println("Please enter 10 student scores:");
        int i = 0;
        do {
            System.out.print("Score #" + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
            char grade = determineGrade(scores[i]);

            // Count each grade occurrence
            switch (grade) {
                case 'C': countC++; break;
                case 'A': countA++; break;
                case 'E': countE++; break;
                case 'B': countB++; break;
                case 'D': countD++; break;
            }
            i++;
        } while (i < 10);

        // Close Scanner
        scanner.close();

        // Display grade summary
        System.out.println("\nGrade Distribution:");
        System.out.println("A: " + countA);
        System.out.println("B: " + countB);
        System.out.println("C: " + countC);
        System.out.println("D: " + countD);
        System.out.println("E: " + countE);
    }
}
