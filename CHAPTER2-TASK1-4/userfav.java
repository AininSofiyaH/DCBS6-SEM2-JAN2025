import java.util.Scanner;

public class userfav {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String name = read.nextLine();

        System.out.print("Enter your age: ");
        int age = read.nextInt();
        read.nextLine(); 

        System.out.print("Enter your hobby: ");
        String hobby = read.nextLine();

        System.out.print("Enter your favorite food: ");
        String favoriteFood = read.nextLine();


        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hobby: " + hobby);
        System.out.println("Favorite Food: " + favoriteFood);

        read.close();
    }
}
