/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classspg;

import java.util.Scanner;

/**
 *
 * @author a_kha
 */
public class CHAPTER4_TWO_TASK2_KHAIR {
    
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter the number of students: "); //total number of Students
        int n = scanner.nextInt();
        
        int passCount = 0, failCount = 0;

        System.out.println("Enter the test results (1 for pass, 0 for fail):"); //Student Test Results
        for (int i = 0; i < n; i++) {
            int result = scanner.nextInt();
            if (result == 1) {
                passCount++;
            } else {
                failCount++;
            }
        }
        
        System.out.println("Number of students who passed: " + passCount);
        System.out.println("Number of students who failed: " + failCount);

        if (passCount > n / 2) {
            System.out.println("Congratulations!\nAverage more than 50% Student Passed\nBonus to instructor"); //Bonus
        }

        scanner.close();
    }}


    

