/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter5task2;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class CHAPTER5TASK2 {

    /**
     * @param args the command line arguments
     */
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static String divide(int a, int b) {
        if (b == 0) {
            return "Undefined (Cannot divide by zero)";
        }
        return String.valueOf((double) a / b);
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first digit: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second digit: ");
        int num2 = input.nextInt();

        System.out.println("\nTambah : " + num1 + " + " + num2 + " = " + add(num1, num2));
        System.out.println("Tolak : " + num1 + " - " + num2 + " = " + subtract(num1, num2));
        System.out.println("Darab : " + num1 + " * " + num2 + " = " + multiply(num1, num2));
        System.out.println("Bahagi : " + num1 + " / " + num2 + " = " + divide(num1, num2));
        System.out.println("Modulus : " + num1 + " % " + num2 + " = " + modulus(num1, num2));

        input.close();
    }
}