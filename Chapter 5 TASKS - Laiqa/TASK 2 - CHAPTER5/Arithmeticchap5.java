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
        
        sum = add(num1,num2);
        sub = minus(num1,num2);
        mul = darab(num1,num2);
        div = bahagi(num1,num2);
        rem = baki(num1,num2);
        
        System.out.println(num1 + " + " + num2 + " = " + sum );
        System.out.println(num1 + " - " + num2 + " = " + sub );
        System.out.println(num1 + " x " + num2 + " = " + mul );
        System.out.println(num1 + " / " + num2 + " = " + div );
        System.out.println(num1 + " % " + num2 + " = " + rem );
    }

public static int add(int x, int y) {
        return x + y; }

public static int minus (int x, int y) {
        return x - y; }

public static int darab(int x, int y) {
        return x*y; }

public static int bahagi(int x, int y) {
        return x/y; }

public static int baki(int x, int y) {
        return x%y; }


}