/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter5task3;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class CHAPTER5TASK3 {

    /**
     * @param args the command line arguments
     */
    //method to determine the grade based on marks  
    public static char getGrade(int marks) {
        if (marks >= 80) return 'A';
        else if (marks >= 65) return 'B';
        else if (marks >= 50) return 'C';
        else if (marks >= 35) return 'D';
        else return 'E';
    }

    public static void main(String[] args) {
        Scanner Userinput = new Scanner(System.in);
        int[] marks = new int[10]; 
        int gradeA = 0, gradeB = 0, gradeC = 0, gradeD = 0, gradeE = 0;

        //user insert 10 marks
        System.out.println("Enter 10 marks (0-100):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = Userinput.nextInt();

            
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.print("Invalid mark! Enter again (0-100): ");
                marks[i] = Userinput.nextInt();
            }

            char grade = getGrade(marks[i]);
            switch (grade) {
                case 'A': gradeA++; break;
                case 'B': gradeB++; break;
                case 'C': gradeC++; break;
                case 'D': gradeD++; break;
                case 'E': gradeE++; break;
            }
        }

        //display all grades
        System.out.println("\nGrade Summary:");
        System.out.println("Grade A: " + gradeA);
        System.out.println("Grade B: " + gradeB);
        System.out.println("Grade C: " + gradeC);
        System.out.println("Grade D: " + gradeD);
        System.out.println("Grade E: " + gradeE);

        Userinput.close();
    }
}