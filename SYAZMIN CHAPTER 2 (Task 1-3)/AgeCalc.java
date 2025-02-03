import java.util.Scanner;

public class AgeCalc {
    public static void main(String[] args) {
        Scanner Age = new Scanner(System.in);

        
        System.out.print("Enter your Name: ");
        String name = Age.nextLine();

        
        System.out.print("Enter the Current Year: ");
        int currentYear = Age.nextInt();

        System.out.print("Enter your Year of Birth (e.g., 2000): ");
        int birthYear = Age.nextInt();
       
        if (birthYear > currentYear || birthYear < 1900) {
            System.out.println("Invalid year of birth. Please enter a valid year between 1900 and " + currentYear + ".");
        } else {
            int age = currentYear - birthYear;

            
            System.out.println("\n====== Age Calculation Result ======");
            System.out.println("Name: " + name);
            System.out.println("Year of Birth: " + birthYear);
            System.out.println("Current Year: " + currentYear);
            System.out.println("Your Age: " + age + " years old");
        }

        Age.close(); 
    }
}