import java.util.Scanner;

public class Chapter5Task1 { 
    public static void main(String[] args) {
        Scanner zam = new Scanner(System.in);

        System.out.println("Enter three integers:");
        int num1 = zam.nextInt();
        int num2 = zam.nextInt();
        int num3 = zam.nextInt();

        int max = Math.max(num1, Math.max(num2, num3));
        int min = Math.min(num1, Math.min(num2, num3));

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

        zam.close();
    }
}