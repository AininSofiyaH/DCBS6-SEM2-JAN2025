/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter3task1;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Chapter3Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the final mark
        System.out.print("Enter your final mark: ");
        int mark = scanner.nextInt();

        // Determine grade based on mark
        String grade;
        if (mark >= 90) {
            grade = "A+";
        }  else {
            grade = "F (Fail)";
        }

        // Display the grade
        System.out.println("Your grade is: " + grade);

        scanner.close();
    }
}

    
    

