package chap5.task2;
import java.util.Scanner;
public class CHAP5TASK2 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner objectname = new Scanner(System.in);
        
        System.out.println("Enter the first digit : ");
        num1 = objectname.nextInt();
        
        System.out.println("Enter the second digit : ");
        num2 = objectname.nextInt();
        
        //display output using method
        System.out.println("Tambah :" + num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println("Tolak :" + num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println("Darab :" + num1 + " * " + num2 + " = " + (num1*num2));
        System.out.println("Bahagi :" + num1 + " / " + num2 + " = " + (num1/num2));
        System.out.println("Peratus :" + num1 + " % " + num2 + " = " + (num1%num2));
        
        objectname.close();
    }
public static int tambah(int a, int b) {
        return a + b; }
    
public static int tolak(int a, int b){
    return a-b; }

public static int darab(int a, int b){
    return a*b; }

public static double bahagi(int a, int b){
    return a/b; }

public static int modulus(int a, int b){
    return a%b; }
}
    
    

