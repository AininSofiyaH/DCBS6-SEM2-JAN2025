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
public class CHAPTER4_TWO_TASK_1_KHAIR {
public class KHAIR_TASK2A_1 {
public static void main(String[] args){
    
    String Correct_Password = "Ayammas"; //Password
    int Limited_Attempts = 5; //Number of attempts allowed
    Scanner scanner = new Scanner(System.in);

int attempts; 

for (attempts = 1; attempts <= Limited_Attempts; attempts++){ //Attempting System
    System.out.println("Enter Password: ");
    String userInput = scanner.nextLine();
    if (userInput.equals(Correct_Password)) {
    System.out.println("Access Granted!");
    break; // Exit the loop immediately
    } else {
    System.out.println("Incorrect password. Attempts left: " + (Limited_Attempts - attempts));
}}

if (attempts > Limited_Attempts) { //Denying System
            System.out.println("Access Denied. Too many failed attempts.");
        }

        scanner.close();
}}}
