package age.calculator;

import java.util.Scanner;
public class AgeCalculator {
   
    public static void main(String[] args) {
        int birthyear, currentyear, age;
        Scanner agepeople = new Scanner(System.in);
        
        System.out.println("Enter current year : ");
        currentyear = agepeople.nextInt();
        
        System.out.println("Enter your birth year : ");
        birthyear = agepeople.nextInt();
        agepeople.close();
        
        age =  currentyear - birthyear;
        System.out.println("Your age is : " +age);
    }
    
}
