/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lammm
 */
import java.util.Scanner;

public class FinalsMark {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        
        System.out.print("Enter your final mark: ");
        int grade = read.nextInt(); 
        
        if (grade >= 70) {
            System.out.println("Grade: A");
        } else if (grade >= 50) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: F");
        }
        
        read.close();
    }
}
