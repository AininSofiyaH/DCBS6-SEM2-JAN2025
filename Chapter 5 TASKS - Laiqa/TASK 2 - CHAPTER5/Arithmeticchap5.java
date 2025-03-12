package arithmeticchap5;
import java.util.Scanner;
public class Arithmeticchap5 {

    public static void main(String[] args) {
       int num1, num2, sum, sub, mul, rem ;
        double div ;
        Scanner numinput = new Scanner(System.in); //declare new object for Scanner
        
        System.out.println("Enter 1st Integer: ");
        num1 = numinput.nextInt(); //read input from user
        
        System.out.println("Enter 2nd Integer: ");
        num2 = numinput.nextInt();
        numinput.close();

        //call methods for formulas
        sum = add(num1,num2);
        sub = minus(num1,num2);
        mul = darab(num1,num2);
        div = bahagi(num1,num2);
        rem = baki(num1,num2);

        //Display all values and results
        System.out.println(num1 + " + " + num2 + " = " + sum );
        System.out.println(num1 + " - " + num2 + " = " + sub );
        System.out.println(num1 + " x " + num2 + " = " + mul );
        System.out.println(num1 + " / " + num2 + " = " + div );
        System.out.println(num1 + " % " + num2 + " = " + rem );
    }

public static int add(int x, int y) {
        return x + y; } //ADDITION FORMULA

public static int minus (int x, int y) {
        return x - y; } //SUBTRACTION FORMULA

public static int darab(int x, int y) {
        return x*y; } //MULTIPLICATION FORMULA

public static int bahagi(int x, int y) {
        return x/y; } //DIVISION FORMULA

public static int baki(int x, int y) {
        return x%y; } //REMAINDER FORMULA


}
