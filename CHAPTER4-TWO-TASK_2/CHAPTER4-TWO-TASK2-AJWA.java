/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter4task2a2;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class CHAPTER4TASK2a2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Ask the user how many student tooke the test
        System.out.print("How many students took the test? ");
        int totalStudents = scanner.nextInt();
        
        int passed = 0, failed = 0;
// Loop through each student to get their test score
        for (int i = 1; i <= totalStudents; i++) {
            System.out.print("Enter score for Student " + i + " (0-100): ");
            int score = scanner.nextInt(); // Read the student's score
// Check if the student passed or failed 
            if (score >= 50) {
                passed++;
            } else {
                failed++;
            }
        }
        System.out.println("Passed: " + passed);
        
        if (passed > totalStudents / 2) {
            System.out.println("Bonus to instructor! :)");
        }
// Display how many student failed
        System.out.println("Failed: " + failed);
        
        System.out.println("More effort needed :(");
// Close the scanner 
        scanner.close();
    }
}
    
    

