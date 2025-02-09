import java.util.Scanner;

public class Chapter3_Task2 {
    public static void main(String[] args) {
        Scanner neu = new Scanner(System.in);

        System.out.println("Choose your operations(1-5)");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulus");
        int num = neu.nextInt();

        System.out.println("Enter two numbers:");
        double a = neu.nextDouble();
        double b = neu.nextDouble();
        
        double add = a + b;
        double sub = a - b;
        double mul = a * b;
        double div = a / b;
        double mod = a % b;
                
        switch (num){
            case 1: System.out.println("Addition = " +add);break;
            case 2: System.out.println("Substraction = " +sub);break;
            case 3: System.out.println("Multiplication = " +mul);break;
            case 4: System.out.println("Division = " +div);break;
            case 5: System.out.println("Modulus = " +mod);break;
            default: System.out.println("Insert properly.");break;
        }
        
        neu.close();
    }
}

