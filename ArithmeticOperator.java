package arithmetic.operator;
import java.util.Scanner;
public class ArithmeticOperator {
    public static void main(String[] args) {
        int num1, num2, userinput, jawapan;
        Scanner operator = new Scanner(System.in);
        
        System.out.println("Masukkan nilai pertama : ");
        num1 = operator.nextInt();
        
        System.out.println("Masukkan nilai kedua : ");
        num2 = operator.nextInt();
        
        
        System.out.println("1.Tambah\n2.Tolak\n3.Darab\n4.Bahagi\n5.Peratus");
        System.out.println("Sila pilih operasi : ");
        userinput = operator.nextInt();
        operator.close();
        
        switch (userinput){
            case 1:
                System.out.println("jawapan : "+(num1 + num2));
                break;
            case 2:
                System.out.println("jawapan : "+(num1 - num2));
                break;
            case 3:
                System.out.println("jawapan : "+(num1 * num2));
                break;
            case 4:
                System.out.println("jawapan : "+(num1 / num2));
                break;
            case 5:
                System.out.println("jawapan : " + (num1 % num2));
                break;
            default:
                System.out.println("ERROR.");
        }
        
        
    }
    
}