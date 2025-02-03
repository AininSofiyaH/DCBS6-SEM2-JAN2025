import java.util.Scanner;
public class chp3_task2 {
    public static void main(String[] args) {
        int operator, num1, num2, add, minus, mult, div, modulus;

        Scanner baca = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        num1 = baca.nextInt();

        System.out.println("Enter the second number: ");
        num2 = baca.nextInt();

        System.out.println("\nEnter the number for your wanted operator (1-5)\n Arithmetic Operator\n 1.Addition\n 2.Substraction\n 3.Multiplication\n 4.Division\n 5.Modulus");
        operator = baca.nextInt();

        add = num1 + num2;
        minus = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        modulus = num1 % num2;

        switch (operator){
            case 1 : System.out.println("Result:\n"+num1 +"+" +num2 +"=" +add); break;
            case 2 : System.out.println("Result:\n"+num1 +"-" +num2 +"=" +minus); break;
            case 3 : System.out.println("Result:\n"+num1 +"x" +num2 +"=" +mult); break;
            case 4 : System.out.println("Result:\n"+num1 +"/" +num2 +"=" +div); break;
            case 5 : System.out.println("Result:\n"+num1 +"%" +num2 +"=" +modulus); break;
            default: System.out.println("Invalid choice"); break;
        }
    }
}