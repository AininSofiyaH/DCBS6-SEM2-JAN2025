import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        int mark1, mark2, final_mark;

        Scanner baca = new Scanner(System.in);

        System.out.println("Enter the paper 1 mark (/50): ");
        mark1 = baca.nextInt();

        System.out.println("Enter the paper 2 mark (/50): ");
        mark2 = baca.nextInt();

        final_mark = mark1 + mark2;

        if (final_mark >= 75) {
            System.out.println("Your mark is: "+final_mark +"\n Your grade is A");}

        else if (final_mark >= 65) {
            System.out.println("Your mark is: "+final_mark +"\n Your grade is B");}

        else if (final_mark >= 55) {
            System.out.println("Your mark is: "+final_mark +"\n Your grade is C");}

        else if (final_mark >= 45) {
            System.out.println("Your mark is: "+final_mark +"\n Your grade is D");}

        else if (final_mark >= 35) {
            System.out.println("Your mark is: "+final_mark +"\n Your grade is E");}

        else {
            System.out.println("Your mark is: " +final_mark +"\n Your grade is F");}

    }
}