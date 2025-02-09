package gradecalc;

import java.util.Scanner;

public class Gradecalc {

    
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        
        System.out.print("Please enter your mark: ");
        int mark = read.nextInt();
        
        String grade;
        if ( mark >= 85) {
            grade = "A";
            
        }    else if (mark >= 70) {
            grade = "B";
            
        }    else if (mark >= 60) {
            grade = "C";
        
        }    else if (mark >= 50) {
            grade = "D";
        
        }    else if (mark >=40) {
            grade = "E";
        
        }   else {
            grade = "Failed";
        } 
        
        System.out.println("Your grade is : " + grade );
        
        read.close();
        
    }
    
}
