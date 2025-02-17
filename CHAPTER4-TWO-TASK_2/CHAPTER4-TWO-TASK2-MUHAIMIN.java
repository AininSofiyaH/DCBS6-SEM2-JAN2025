import java.util.Scanner;

public class StudentPassFail {
    public static void main(String[] args) {
        Scanner meen = new Scanner(System.in);
        int pass = 0, fail = 0; //Current value 

        System.out.print("Enter number of students: ");
        int num_student = meen.nextInt();

        for (int i = 1; i <= num_student; i++) {
            System.out.print("Enter result for student " + i + " (1 = Pass, 0 = Fail): ");
            int result = meen.nextInt();

            if (result == 1) {
                pass++; //increament
            } else {
                fail++;
            }
        }

        System.out.println("\n============ SUMMARY ============");
        System.out.println("Total Pass: " + pass);
        System.out.println("Total Fail: " + fail);
        System.out.println("Percentage of Pass: " + ((pass * 100.0) / (pass + fail)) + "%"); //Show Persentage of pass studrnt
        

        if (pass > num_student / 2) {
            System.out.println("Bonus to instructor!");
        }

        meen.close();
    }
}
