/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classspg;

import java.util.Scanner;
int Grade


/**
 *
 * @author a_kha
 */

public class GradeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the final mark: ");
        int mark = scanner.nextInt();

        // Check if the student passed or failed
        if (mark >= 60) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }

        scanner.close(); // Close the scanner
    }
}


