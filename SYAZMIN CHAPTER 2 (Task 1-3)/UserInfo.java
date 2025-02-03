import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your Name: ");
        String name = scanner.nextLine(); 

        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter your Hobby: ");
        String hobby = scanner.nextLine(); 

        System.out.print("Enter your Favorite Food: ");
        String favoriteFood = scanner.nextLine();

        System.out.println("\n====== User Information ======");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hobby: " + hobby);
        System.out.println("Favorite Food: " + favoriteFood);

        scanner.close();
    }
}