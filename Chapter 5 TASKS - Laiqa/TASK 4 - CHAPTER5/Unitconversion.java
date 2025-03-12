package unitconversion;
import java.util.Scanner;
public class Unitconversion {

    public static void main(String[] args) {
        Scanner userinp = new Scanner(System.in);
        //declare and initialize
        int choice;
        double value, result = 0; 
        formula objFormula = new formula(); //call method for formula class
        
        do {
            //display menu
            System.out.println("Unit Conversion Menu:");
            System.out.println("1. Temperature (Celsius to Fahrenheit)");
            System.out.println("2. Length (Meters to Feet)");
            System.out.println("3. Weight (Kilograms to Pounds)");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            choice = userinp.nextInt();
            
              if (choice == 4) { //exit when user input 4
                System.out.println("### Program exited. Thank you for using this system. ###");
                break;}
                
            System.out.print("Enter value to convert: "); //let user input value to convert
            value = userinp.nextDouble();
            
            
            switch (choice) {
                case 1:
                    result = objFormula.temp(value); //call method from class formula
                    System.out.println(value + " celcius is " + result + " fahrenheit.\n"); //display
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
                    System.out.println("### Invalid choice. Please try again. ###"); //error message if user input anything other than 1-4
            }

        } while (choice!=4); //loop selagi user tak input 4 
                
    }
}
