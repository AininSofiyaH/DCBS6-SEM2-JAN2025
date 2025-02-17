

import java.util.Scanner;

public class ArithmeticProg {
    public static void main(String[] args) {
        
        int num1, num2, answer;
        Scanner Math = new Scanner(System.in);
       
        System.out.println("Insert your first number");
        num1 = Math.nextInt();
        
        
        
        System.out.println("Insert your second number");
        num2 = Math.nextInt();
        Math.close();
        
        
        System.out.println("Answer : " + num1 +"+"+num2 +"="+ (num1+num2));
        
        
    }
    
}
    

