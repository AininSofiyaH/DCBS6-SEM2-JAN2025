import java.util.Scanner;

public class Task42a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int totalStudents = scanner.nextInt();
        
        int passed = 0, failed = 0;
        
        for (int i = 1; i <= totalStudents; i++) {
            System.out.print("Enter Student " + i + " result, (1 for Pass, 0 for Fail):");
            int result = scanner.nextInt();
            
            if (result == 1) {
                passed++;
            } else if (result == 0) {
                failed++;
            } else {
                System.out.println("Invalid input. Please enter again.");
                i--;
            }
            
            System.out.println("\nTotal Passed: " + passed);
            System.out.println("\nTotal Failed: " + failed);
            
            if (passed > totalStudents / 2 ) {
                System.out.println("Good job, instructor!\n+Rm300");
            }
            
            
        }
        scanner.close();
    }
}
