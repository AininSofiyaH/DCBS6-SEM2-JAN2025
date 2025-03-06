package chap5.task1;
import java.util.Scanner;
public class CHAP5TASK1 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //scanner untuk ambil input dari user
        int num1,num2,num3,max,min;
        String choice; //simpan user's choice untuk continue atau exit
        
    do{

        System.out.print("Enter first number: "); //minta user masukkan first digit
        num1 = input.nextInt();
        
        System.out.print("Enter second number: "); //ask user to enter the second digit
        num2 = input.nextInt();
        
        System.out.print("Enter third number: "); //ask user to enter the third digit
        num3 = input.nextInt();

        max = Math.max(num1, Math.max(num2, num3));
        min = Math.min(num1, Math.min(num2, num3));

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        System.out.print("Do you want to continue? (y/n): ");
        input.nextLine();
        choice = input.nextLine();
        
        }while(choice.charAt(0) == 'Y' || choice.charAt(0) == 'y');
    
        System.out.println("Program Ended. Thank  You!");
        input.close();
}


public static int findMax(int a, int b, int c){
    return Math.max(a, Math.max(b,c)); }
    
public static int findMin(int a, int b, int c){
    return Math.min(a, Math.min(b,c)); }
}