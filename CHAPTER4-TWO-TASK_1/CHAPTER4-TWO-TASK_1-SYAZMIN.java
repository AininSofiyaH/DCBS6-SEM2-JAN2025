import java.util.Scanner;

public class PasswordSystem {
    public static void main(String[] args) {
        Scanner pass = new Scanner(System.in);
        final String CORRECT_PASSWORD = "cisco"; // The correct password
        int attempts = 3; // Maximum amount of attempts

        while (attempts > 0) {
            System.out.print("Please enter your password: ");
            String inputPassword = pass.nextLine();

            if (inputPassword.equals(CORRECT_PASSWORD)) {
                System.out.println("Access granted.");
                break;
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Incorrect password. Remain attempts : " + attempts);
                } else {
                    System.out.println("Too many attempts. Please try again later.");
                }
            }
        }

        pass.close();
    }
}

