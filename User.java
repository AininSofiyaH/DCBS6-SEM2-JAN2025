package user;

import java.util.Scanner;
public class User {
    public static void main(String[] args) {
        String name, hobby, favfood;
        int age;
        Scanner objectname = new Scanner(System.in);
        
        System.out.println("Enter your name : ");
        name = objectname.nextLine();
        
        System.out.println("Enter your age : ");
        age = objectname.nextInt();
        
        objectname.nextLine(); //kena letak atas balik sebab lepas int tak boleh baca  string
        System.out.println("Enter your hobby : ");
        hobby = objectname.nextLine();
        
        System.out.println("Enter your favfood : ");
        favfood = objectname.nextLine();
        objectname.close();
        
        System.out.println("Name : " +name);
        System.out.println("Age : " +age);
        System.out.println("Hobby : " +hobby);
        System.out.println("Favfood : " +favfood);
    }
    
}
