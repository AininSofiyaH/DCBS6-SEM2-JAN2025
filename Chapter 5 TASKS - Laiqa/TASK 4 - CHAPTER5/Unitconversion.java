package unitconversion;
import java.util.Scanner;
public class Unitconversion {

    public static void main(String[] args) {
        Scanner userinp = new Scanner(System.in);
        int choice;
        double value, result = 0;
        formula objFormula = new formula();
        
        do {
            System.out.println("Unit Conversion Menu:");
            System.out.println("1. Temperature (Celsius to Fahrenheit)");
            System.out.println("2. Length (Meters to Feet)");
            System.out.println("3. Weight (Kilograms to Pounds)");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            choice = userinp.nextInt();
            
              if (choice == 4) {
                System.out.println("### Program exited. Thank you for using this system. ###");
                break;}
                
            System.out.print("Enter value to convert: ");
            value = userinp.nextDouble();
            
            
            switch (choice) {
                case 1:
                    result = objFormula.temp(value);
                    System.out.println(value + " celcius is " + result + " fahrenheit.\n");
                    break;
                    
                case 2:
                    result = objFormula.lenght(value);
                    System.out.println(value + " meters is " + result + " feet.\n");
                    break;
  
                case 3:
                    result = objFormula.weight(value);
                    System.out.println(value + " kilograms is " + result + " pounds.\n");
                    break;
                    
                default:
                    System.out.println("### Invalid choice. Please try again. ###");
            }

        } while (choice!=4);
                
    }
}
