/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalsmark;

/**
 *
 * @author lammm
 */
import java.util.Scanner;

public class Arithmeticprog {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Select an arithmetic operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter the number of your calculation choice (1-4): ");
        
        int choice = read.nextInt(); 

        System.out.print("Enter the first number: ");
        double num1 = read.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = read.nextDouble();
        
        double result = 0;
        boolean validOperation = true;

        switch (choice) {
            case 1: 
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
            case 2: 
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
            case 3: 
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;
            case 4: 
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false; 
                }
                break;
            default: 
                System.out.println("Invalid choice! Please select a valid operation.");
                validOperation = false;
                break;
        }

        if (validOperation) {
            System.out.println("The result of the operation is: " + result);
        }

        read.close();
    }
}

