package userprofile;
import java.util.Scanner;

public class UserProfile {

    public static void main(String[] args) {
        String name, hobby, favefood;
        int age;
        Scanner userinput = new Scanner(System.in); //declare new object for Scanner
        
        System.out.println("Enter your name: ");
        name = userinput.nextLine(); //read input from user
        
        System.out.println("Enter your age: ");
        age = userinput.nextInt();
        
        userinput.nextLine(); //after int kena neutralize kan balik so dia boleh baca string
        System.out.println("Enter your hobby: ");
        hobby = userinput.nextLine();
        
        System.out.println("Enter your favourite food: ");
        favefood = userinput.nextLine();
        
        userinput.close();
        
        System.out.println("Name :" + name);
        System.out.println("Age :" + age);
        System.out.println("Hobby :" + hobby);
        System.out.println("Favourite Food :" + favefood);
    }
    
}
