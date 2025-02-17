import java.util.Scanner;

public class Passwordsystem {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        final String CORRECT_PASSWORD = "aijaz144";
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter your password: ");
            String inputPassword = read.nextLine();

            if (inputPassword.equals(CORRECT_PASSWORD)) {
                System.out.println("Correct password!");
                break;
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Incorrect password, Attempts left: " + attempts);
                } else {
                    System.out.println("Account locked. To many attempts, Try again later.");
                }
            }
        }

        read.close();
    }
}