
import java.util.Scanner;

public class Chapter3Task1 {
    public static void main(String[] args) {
    Scanner grade = new Scanner(System.in);
    
    System.out.println("Enter your mark");
    int mark = grade.nextInt();
    
    
    if (mark >=80 && mark <=100){
    System.out.println ("Grade A");
    }else if (mark >=70){
    System.out.println ("Grade B");
    }else if (mark >=60){
    System.out.println ("Grade C");
    }else if (mark >50) {
    System.out.println ("Grade D");
    }else if (mark >=0) {
    System.out.println ("YOU FAILED");
       }   
}
}
