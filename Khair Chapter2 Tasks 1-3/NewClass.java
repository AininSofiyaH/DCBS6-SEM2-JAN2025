import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        String name,hobby,favfood;
        int age;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter Your Name");
        name = in.nextLine();
 in.nextLine(); 
         System.out.println("What's Your Hobby?");
         hobby = in.nextLine();
         
         System.out.println("What's your favourite food?");
         favfood = in.nextLine();
         
        System.out.println("Enter Your Age");
        age = in.nextInt();
        
        
         
        
        // Consume the leftover newline character
        in.nextLine(); 

        in.close(); 

       
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hobby: " +hobby);
        System.out.println("Favourite Food: " +favfood);
    }
}
