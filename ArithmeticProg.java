package arithmeticprog;
import java.util.Scanner;
public class ArithmeticProg {

    public static void main(String[] args) {
        int num1, num2;
        Scanner objectname = new Scanner(System.in);
        
        System.out.println("Enter the first digit : ");
        num1 = objectname.nextInt();
        
        System.out.println("Enter the second digit : ");
        num2 = objectname.nextInt();
        
        System.out.println("Tambah :" + num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println("Tolak :" + num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println("Darab :" + num1 + " * " + num2 + " = " + (num1*num2));
        System.out.println("Bahagi :" + num1 + " / " + num2 + " = " + (num1/num2));
        System.out.println("Peratus :" + num1 + " % " + num2 + " = " + (num1%num2));
    }
    
}
