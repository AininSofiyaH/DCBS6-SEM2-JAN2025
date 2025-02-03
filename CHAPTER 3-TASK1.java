package finalmark;
import java.util.Scanner;
public class Finalmark {
    public static void main(String[] args) {
        int mark;
        char grade;
        Scanner finalmark = new Scanner(System.in);
        
        System.out.println("Enter your mark : ");
        mark = finalmark.nextInt();
        finalmark.close();
        
        if(mark>=80){
            grade = 'A';
        } else if (mark>=70){
            grade = 'B';
        } else if (mark>=60) {
            grade = 'C';
        } else if (mark>=50){
            grade = 'D';
        }else{
            grade = 'F';}
            System.out.println("Your grade is : "+grade);
        }
            
    
    }
    

