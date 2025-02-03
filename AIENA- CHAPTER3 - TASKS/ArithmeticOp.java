/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arithmeticop;

/**
 *
 * @author Nuwaira
 */
import java.util.Scanner;
public class ArithmeticOp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        Scanner read = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter first number: ");
        num1 = read.nextInt();

        System.out.print("Enter second number: ");
        num2 = read.nextInt();

        System.out.println("Choose arithmetic operator : ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction ");
        System.out.println("3. Multiplication ");
        System.out.println("4. Division ");
        System.out.println("Pick 1-4 ");

        int choice = read.nextInt();
        
        double result;
        switch(choice){
			case 1:
                                result = num1 + num2;
                                System.out.println("Answer: " + result);
                                break;
                                
                        case 2:
                                result = num1 - num2;
                                System.out.println("Answer: " + result);
                                break;
                                
                        case 3:
                                result = num1 * num2;
                                System.out.println("Answer: " + result);
                                break;
                                
                         case 4:
                                if (num2 != 0) {
                                result = num1 / num2;
                                System.out.println("Result: " + result);
                        } else {
                                System.out.println("Error");
                        }
                                break;
        }
        read.close();
        
        }
    }

