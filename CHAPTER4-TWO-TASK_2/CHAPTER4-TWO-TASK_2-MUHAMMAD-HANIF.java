import java.util.Scanner;

 class StudentExam {
    public static void main(String[] args) {
        Scanner student = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = student.nextInt();
        int passCount = 0, failCount = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            int marks = student.nextInt();
            if (marks >= 50) {
                passCount++;
            } else {
                failCount++;
            }
        }

        System.out.println("Passed: " + passCount);
        System.out.println("Failed: " + failCount);

        if (passCount > n / 2) {
            System.out.println("Bonus to instructor");
        }
        student.close();
    }
}