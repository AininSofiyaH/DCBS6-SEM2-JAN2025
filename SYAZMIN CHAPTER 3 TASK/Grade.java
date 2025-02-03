import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner Grade = new Scanner(System.in);

        System.out.print("Enter your mark: ");
        int mark = Grade.nextInt();

        if (mark >= 90 && mark <= 100) {
            System.out.println("Grade: A");
        } else if (mark >= 80) {
            System.out.println("Grade: B");
        } else if (mark >= 70) {
            System.out.println("Grade: C");
        } else if (mark >= 60) {
            System.out.println("Grade: D");
        } else if (mark >= 40) {
            System.out.println("Grade: E");
        } else if (mark >= 0) {
            System.out.println("Grade: G");
        } else {
            System.out.println("Invalid mark. Please enter a number between 0 and 100.");
        }

        Grade.close();
    }
}