/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testresult;

/**
 *
 * @author Nuwaira
 */
import java.util.Scanner;
public class TestResult {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);

        System.out.print ("Enter the total of students : ");
        int TotalStd = read.nextInt(); //declare a variable 
        int passed = 0, failed = 0;
                
        System.out.println("Enter 1 : pass and 0 : fail\n"); 

        for (int i = 1; i <= TotalStd; i++) {  //execute block of code
        System.out.print("Result for student " + i + ":"); 
        int result = read.nextInt(); //user input result
       
            if (result == 1) { //loop stops
                passed++;
                
            } else if (result == 0) {
                failed++;
            } else {
                System.out.println("Invalid, retry!");
                i--; // repeat input
            }
        }
        
        // display results
        System.out.println("\nStudents with flying colors: " + passed);
        System.out.println("Failed Students: " + failed);

        // check if instructor gets a bonus
        if (passed > TotalStd / 2) {
            System.out.println("Bonus to instructor!");
        }
        read.close();
    }
}