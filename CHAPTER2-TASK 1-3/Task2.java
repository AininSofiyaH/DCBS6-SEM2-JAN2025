import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
    Scanner info = new Scanner(System.in);
    
    System.out.print("HANG NAMA APA: ");
    String name = info.nextLine();
    
    System.out.print("HANG UMOQ BRAPA: ");
    int age = info.nextInt();
    info.nextLine();
    
    System.out.print("HOBI HANG APA: ");
    String hobby = info.nextLine();
    
    System.out.print("APA PEBERET POOD: ");
    String food = info.nextLine();
    
    System.out.println(); 
    System.out.println("Result: ");
    System.out.println("HANG NAMA APA: "+ name);
    System.out.println("HANG UMOQ BRAPA: "+ age );
    System.out.println("HOBI HANG APA: " + hobby);
    System.out.println("APA PEBERET POOD: " + food);
          
    
    

        
    
    
    
    
    
    }
}