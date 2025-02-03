import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);

        
        System.out.print("Enter your marks (0-100): ");
        int marks = baca.nextInt();


        if (marks < 0 || marks > 100) {
            System.out.println("Invalid");
        } else {
            String grade;
            if (marks >= 90) {
                grade = "A";
            } else if (marks >= 80) {
                grade = "B";
            } else if (marks >= 70) {
                grade = "C";
            } else if (marks >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.println("Your grade is: " + grade);
        }
        baca.close();
    }
}