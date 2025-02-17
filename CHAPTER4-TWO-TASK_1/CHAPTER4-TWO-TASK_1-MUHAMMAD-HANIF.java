import java.util.Scanner;

 class PasswordSystem {
    public static void main(String[] args) {
        final String CORRECT_PASSWORD = "hanif123"; 
        final int MAX_ATTEMPTS = 3;
        Scanner lapar = new Scanner(System.in);
        int attempts = 0;
        String input;

        do {
            System.out.print("Enter password: ");
            input = lapar.nextLine();
            attempts++;

            if (input.equals(CORRECT_PASSWORD)) {
                System.out.println("Access granted!");
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
            }

        } while (attempts < MAX_ATTEMPTS);

        if (!input.equals(CORRECT_PASSWORD)) {
            System.out.println("Access denied! Too many attempts.");
        }

        lapar.close();
    }
}
