import java.util.Scanner;

public class Chapter5Task2 {
    
    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    
    public static int findMin(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
    
    public static int Input(Scanner zam, String prompt) {
        System.out.print(prompt);
        return zam.nextInt();
    }
    
    public static void execute() {
        Scanner zam = new Scanner(System.in);
        char choice;
        
        do {
            int num1 = Input(zam, "Enter the first integer: ");
            int num2 = Input(zam, "Enter the second integer: ");
            int num3 = Input(zam, "Enter the third integer: ");
            
            int max = findMax(num1, num2, num3);
            int min = findMin(num1, num2, num3);
            
            System.out.println("Maximum value: " + max);
            System.out.println("Minimum value: " + min);
            
            System.out.print("Retry? (Y/N): ");
            choice = zam.next().charAt(0);
            
        } while (choice == 'y' || choice == 'Y');
        
        zam.close();
        System.out.println("Program exited.");
    }
    
    public static void main(String[] args) {
        execute();
    }
}