/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter5task4;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class CHAPTER5TASK4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        double value, result = 0;
        ConversionFormula formula = new ConversionFormula();
        do {
            // Display menu
            System.out.println("\nUnit Conversion Menu:");
            System.out.println("1. Temperature (Celsius to Fahrenheit)");
            System.out.println("2. Distance (Kilometers to Miles)");
            System.out.println("3. Weight (Kilograms to Pounds)");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            choice = input.nextInt();

            if (choice == 4) {
                System.out.println("Exiting system. Thank you for using my system !");
                break;
            }

            // Get input value from user
            System.out.print("Enter value to convert: ");
            value = input.nextDouble();

            // Perform conversion based on choice
            switch (choice) {
                case 1:
                    result = ConversionFormula.celsiusToFahrenheit(value);
                    break;
                case 2:
                    result = ConversionFormula.kilometersToMiles(value);
                    break;
                case 3:
                    result = ConversionFormula.kilogramsToPounds(value);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    continue; // Skip rest of loop and go to next iteration
            }

            // Display result
            System.out.printf("Converted value: %.2f\n", result);

        } while (true); // Infinite loop until user exits

        input.close();
    }
}
