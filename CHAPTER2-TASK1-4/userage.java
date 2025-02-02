import java.util.Scanner;


public class userage {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        
        System.out.print("Insert your birthyear: ");
        int birthYear = baca.nextInt();
        
        int age = 2025 - birthYear;
        
        System.out.println("Age: " + age + " years old");
        
        baca.close();
    }
}
