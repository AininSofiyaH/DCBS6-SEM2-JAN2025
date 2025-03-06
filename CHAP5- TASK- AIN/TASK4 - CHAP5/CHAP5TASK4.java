package chap5.task4;
import java.util.Scanner; //import scanner for user input
public class CHAP5TASK4 {
    public static void main(String[] args) {
        Scanner unit = new Scanner (System.in);
        int choice;
        char repeat;
        double result, celsius, kilometers, kilograms;
        formula objFormula = new formula();
        
        do {
        //display menu untuk user
        System.out.println("Choose the type of unit conversion : ");
        System.out.println("1. Celsius to Fahrenheit.");
        System.out.println("2. Kilometers to Feet.");
        System.out.println("3. Kilograms to Pounds.");
        System.out.print("Enter your choice (1-3): ");
        
        choice = unit.nextInt(); //get user input choice
        
        switch(choice){
            case 1:
                System.out.print("Enter temperature in Celsius: "); 
                celsius = unit.nextDouble(); //save input suhu user
                result = objFormula.CelsiusToFahrenheit(celsius); //panggil method
                System.out.println("Temperature in Fahrenheit: " +result);
                break;
                
            case 2:
                System.out.print("Enter distance in Kilometers: ");
                kilometers = unit.nextDouble(); //save input jarak user
                result = objFormula.KilometerToFeet(kilometers); //panggil method
                System.out.println("Distance in Feet: " +result);
                break; 
        
            case 3:
                System.out.print("Enter weight in Kilograms: "); //ask user to enter weight in kg
                kilograms = unit.nextDouble(); //save input berat user
                result = objFormula.KilogramToPounds(kilograms); //panggil method
                System.out.println("Weight in Pounds: " +result);
                break;
            
            default:
                System.out.println("Invalid Choice! Please try again(choose 1-3)."); //kalau user masukkan salah input
        }
                System.out.print("Do you want to convert again? (y/n): "); //ask the user if want to continue
            repeat = unit.next().charAt(0); //save jawapan user
            
        } while (repeat == 'y' || repeat == 'Y'); //ulang kalau pengguna masukkan 'y' atau 'Y'
        
        
        
        unit.close(); //close scanner
    }}

    