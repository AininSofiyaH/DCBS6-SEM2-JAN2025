import java.util.Scanner;
public class student_marks {
    public static void main(String[] args) {

        int i = 0;
        int student = 0, mark = 0, pass = 0, fail = 0, result = 0;
        Scanner baca = new Scanner(System.in);
        System.out.println("Enter how many student you want to assign marks: ");
        student = baca.nextInt(); //user enter input for number of students

        while (i < student) { //loop according to number of student
            i++;
            System.out.println("Enter the marks for student "+i);
            mark = baca.nextInt(); //user assign marks for each student

            if (mark > 50) //if student marks above 50 it'll add 1 to pass variable
               pass ++;

            else //while it'll add 1 to fail if student marks below 50
                fail ++;
        }
        System.out.println("Passed student = "+pass);
        System.out.println("Failed student = "+fail);

        if (result >= fail) //if more than 50% student passed, it will display this message
            System.out.println("Bonus to instructor");
    }
}
