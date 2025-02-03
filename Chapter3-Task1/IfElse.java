package ifelse;
import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        int mark;
        char grade;
        Scanner markinput = new Scanner(System.in); //declare new object for Scanner
        
        System.out.println("Enter your mark: ");
        mark = markinput.nextInt(); 
        markinput.close();
        
        if (mark>= 80) {
        grade = 'A';}
        else if (mark>=70){
        grade = 'B';}
        else if (mark>=60){
        grade = 'C';}
        else if (mark>=50){
        grade = 'D';}
        else{
         grade ='F';}
        System.out.println("Your grade is " + grade);
    }
    
}
