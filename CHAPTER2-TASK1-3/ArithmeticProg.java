package arithmeticprog;
import java.util.Scanner;

public class ArithmeticProg {
    public static void main(String[] args) {
   
        int num1, num2, sum, sub, mul, rem ;
        double div ;
        Scanner numinput = new Scanner(System.in); //declare new object for Scanner
        
        System.out.println("Enter 1st Integer: ");
        num1 = numinput.nextInt(); //read input from user
        
        System.out.println("Enter 2nd Integer: ");
        num2 = numinput.nextInt();
        numinput.close();
        
        sum = num1 + num2;
        sub = num1 - num2;
        mul = num1*num2;
        div = num1/num2;
        rem = num1%num2;
        
        System.out.println(num1 + " + " + num2 + " = " + sum );
        System.out.println(num1 + " - " + num2 + " = " + sub );
        System.out.println(num1 + " x " + num2 + " = " + mul );
        System.out.println(num1 + " / " + num2 + " = " + div );
        System.out.println(num1 + " % " + num2 + " = " + rem );
    }
    
}
