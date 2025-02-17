import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int pass = 0;
        int fail = 0;
        
        System.out.print("Enter number of students: ");
        int totalStudents = read.nextInt();
        
        for (int i = 0; i < totalStudents; i++) {
            System.out.print("Enter marks for student " + (i+1) + ": ");
            int marks = read.nextInt();
            
            if (marks >= 50) {
                pass++;
            } else {
                fail++;
            }
        }
        
        System.out.println("Passed: " + pass);
        System.out.println("Failed: " + fail);
        
        double passPercentage = (double) pass / totalStudents * 100;
        if (passPercentage > 50) {
            System.out.println("Bonus to instructor!");
        }
        
        read.close();
    }
}