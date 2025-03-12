package averagegradescalc;
import java.util.Scanner;
public class Averagegradescalc {

    public static void main(String[] args) {
        Scanner scoopy = new Scanner (System.in);
        formula Objformula = new formula();
        String name1, name2, name3, topstu;
        double highestavg;
        double markah1_1, markah1_2, markah1_3, avg1;
        double markah2_1, markah2_2, markah2_3, avg2;
        double markah3_1, markah3_2, markah3_3, avg3;
        
        //Student 1
        System.out.println("Enter details for Student 1 :");
        System.out.print("Name : ");
        name1 = scoopy.nextLine();
        System.out.println("Enter 3 marks for " + name1 + " : " );
        markah1_1 = scoopy.nextDouble();
        markah1_2 = scoopy.nextDouble();
        markah1_3 = scoopy.nextDouble();
        avg1 = Objformula.Average(markah1_1, markah1_2, markah1_3);
        scoopy.nextLine(); //clearkan scanner to read next line
        
        //Student 2
        System.out.println("Enter details for Student 2 :");
        System.out.print("Name : ");
        name2 = scoopy.nextLine();
        System.out.println("Enter 3 marks for " + name2 + " : " );
        markah2_1 = scoopy.nextDouble();
        markah2_2 = scoopy.nextDouble();
        markah2_3 = scoopy.nextDouble();
        avg2 = Objformula.Average(markah2_1, markah2_2, markah2_3);
        scoopy.nextLine(); //clearkan scanner to read next line
        
        //Student 3
        System.out.println("Enter details for Student 3 :");
        System.out.print("Name : ");
        name3 = scoopy.nextLine();
        System.out.println("Enter 3 marks for " + name3 + " : " );
        markah3_1 = scoopy.nextDouble();
        markah3_2 = scoopy.nextDouble();
        markah3_3 = scoopy.nextDouble();
        avg3 = Objformula.Average(markah3_1, markah3_2, markah3_3);
        scoopy.nextLine(); //clearkan scanner to read next line
        
        //Display all averages
        System.out.println("\nStudent Averages:");
        System.out.println(name1 + "'s average: " + avg1);
        System.out.println(name2 + "'s average: " + avg2);
        System.out.println(name3 + "'s average: " + avg3);
        
        highestavg = Objformula.highestAvg(avg1, avg2, avg3);
        
        topstu = name1;
        if (avg2 > highestavg) {
            topstu = name2;
        }

        if (avg3 > highestavg) {
            topstu = name3;
        }
        
                System.out.println ("The highest average is : " + highestavg + "\nAchieved by : " + topstu);
        
        
    }
}
