import java.util.Scanner;
public class ArithmeticOperator {
	 public static void main(String[] args) {
	        int arithmeticoperator, num1, num2, sum, minus, multiply, divide, modulus;
	        Scanner read = new Scanner(System.in);
			
	        System.out.print("Sila Masukkan Nombor Yang Pertama : ");
	        num1 = read.nextInt();
			
			System.out.print("Sila Masukkan Nombor Yang Kedua : ");
			num2 = read.nextInt();
	        
			System.out.println("1.Tambah");
			System.out.println("2.Tolak");
			System.out.println("3.Darab");
			System.out.println("4.Bahagi");
			System.out.println("5.Modulus\n");
			
			System.out.println("Sila Pilih Operasi : ");
			arithmeticoperator = read.nextInt();
			
			sum = num1 + num2;
			minus = num1 - num2;
			multiply = num1 * num2;
			divide = num1 / num2;
			modulus = num1 % num2;
		
			
	        switch(arithmeticoperator) {
	               case 1:System.out.println(num1 + "+" + num2 + "=" + sum);break;
	               case 2:System.out.println(num1 + "-" + num2 + "=" + minus);break;
	               case 3:System.out.println(num1 + "X" + num2 + "=" + multiply);break;
	               case 4:System.out.println(num1 + "/" + num2 + "=" + divide);break;
	               case 5:System.out.println(num1 + "%" + num2 + "=" + modulus);break;}
	              
	 }
	 
}