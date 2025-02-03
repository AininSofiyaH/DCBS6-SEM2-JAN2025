/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cahpter3task2;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Cahpter3Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner read = new Scanner(System.in);
     
     System.out.println("Enter the first number: ");
     double num1 = read.nextDouble();
     
     System.out.println("Enter operator (+,-,*,/): ");
     char operator = read.next().charAt(0);
     
     System.out.println("Enter the second number: ");
     double num2 = read.nextDouble();
        
        double result = 0;
        switch (operator) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = (num2 != 0) ? num1 / num2 : Double.NaN; break;
            default: System.out.println("Invalid operator"); return;
        }
        
        System.out.println("Result: " + result);
        read.close();
    }
}
    
    

