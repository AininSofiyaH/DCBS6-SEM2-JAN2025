package agecalculator;

import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {
        int birthyear, currentyear, age ;
        Scanner numinput = new Scanner(System.in); //declare new object for Scanner
        
        System.out.println("Enter birth year: ");
        birthyear = numinput.nextInt(); //read input from user
        
        System.out.println("Enter current year: ");
        currentyear = numinput.nextInt();
        numinput.close();
        
        age = currentyear - birthyear;
       
        System.out.println("Your current age is " + age );
    }
    
}
