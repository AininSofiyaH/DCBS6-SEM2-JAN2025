import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner Name = new Scanner(System.in);
        
        System.out.print("Enter your Name: ");
        String name = Name.nextLine(); 

        System.out.print("Enter your Age: ");
        int age = Name.nextInt();
        Name.nextLine(); 

        System.out.print("Enter your Hobby: ");
        String hobby = Name.nextLine(); 

        System.out.print("Enter your Favorite Food: ");
        String favoriteFood = Name.nextLine();

        System.out.println("\n====== User Information ======");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hobby: " + hobby);
        System.out.println("Favorite Food: " + favoriteFood);

        Name.close();
    }
}