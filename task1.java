import java.util.Scanner;

public class NewClass8 {
    public static void main(String[] args) {
        Scanner muhammad  = new Scanner(System.in);
        
        // Input two integers
        System.out.print("masukan nombor pertama: ");
        int num1 = muhammad.nextInt();
        
        System.out.print("masukan nombor kedua: ");
        int num2 = muhammad.nextInt();
        
        // Perform arithmetic operations
        System.out.println("tambah: " + (num1 + num2));
        System.out.println("tolak: " + (num1 - num2));
        System.out.println("darab: " + (num1 * num2));
        System.out.println("bahagi: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));
        
        muhammad.close();
    }
}
