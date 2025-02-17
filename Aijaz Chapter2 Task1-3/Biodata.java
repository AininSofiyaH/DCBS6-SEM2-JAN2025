import java.util.Scanner;

class Biodata {

   public static void main(String[] args) {

       String name,hobby,favfood;
       int age;
       
       Scanner read = new Scanner(System.in);

       System.out.println("Enter your name:");
       name = read.nextLine();

       System.out.println("Enter your age:");
       age=read.nextInt();

       read.nextLine();//neutralises the data type
       
       System.out.println("Enter your hobby:");
       hobby = read.nextLine();
       
       System.out.println("Enter your favourite food:");
       favfood = read.nextLine();
       
       read.close();            

       System.out.println("Name :"+name);
       System.out.println("Age :"+age);
       System.out.println("Hobby :"+hobby);
       System.out.println("Favourite food :"+favfood);

    }
}