import java.util.Scanner;

public class CHAPTER4_TWO_TASK_1_MULTAZAM {
    public static void main(String[] args) {
        // Setup the real password and num. of attempts
        int real = 178;
        int attempts = 5;
        Scanner zam = new Scanner(System.in);

        // Tell user to enter password
        for (int attempt = 0; attempt < attempts; attempt++) {
            System.out.print("Enter password: ");
            int guess = zam.nextInt();

            //Determine if user guess correct or not
            if (real == guess) {
                System.out.println("Your guess is correct!!!");
                return;
            } else {
                System.out.println("Still not. Try harder\n");
            }
        }

        // Tell them their attempts are over
        System.out.println("Your guess is still wrong");
    }
}

