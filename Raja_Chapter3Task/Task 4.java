import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		String name, hobby, favourite_food;
		int age;
		Scanner read = new Scanner(System.in); 
		
		System.out.print("Enter your name : ");
		name = read.nextLine();
		
		System.out.print("Enter your age : ");
		age = read.nextInt();
		
		read.nextLine();
		System.out.print("Enter your hobby : ");
		hobby = read.nextLine();
		
		System.out.print("Enter your favourite_food : ");
		favourite_food = read.nextLine();
		
		System.out.println("nama : " +name);
		System.out.println("age : " +age);
		System.out.println("hobby : " +hobby);
		System.out.println("favourite_food : " +favourite_food);
		
		System.exit(0);
	}
}
