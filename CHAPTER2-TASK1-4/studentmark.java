import java.util.Scanner;

public class studentmark {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        

        System.out.print("Enter Student Name: ");
        String name = read.nextLine();
        
        System.out.print("Enter Student ID: ");
        String id = read.nextLine();
        
        System.out.print("Enter Subject: ");
        String subject = read.nextLine();
        
        System.out.print("Enter marks for Test 1 (out of 100): ");
        double test1 = read.nextDouble();
        
        System.out.print("Enter marks for Test 2 (out of 100): ");
        double test2 = read.nextDouble();
        

        double average = (test1 + test2) / 2;
        

        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Subject: " + subject);
        System.out.println("Average Mark: " + average);
        
        read.close();
    }
}
