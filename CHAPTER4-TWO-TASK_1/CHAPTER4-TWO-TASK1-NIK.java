import java.util.Scanner;  // Import Scanner class for input

public class Demo {
    private static final String SAVED_HASHED_PASSWORD = hashPassword("Irfan12345");
    private static final int MAX_ATTEMPTS = 3;
    
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);  // Create a Scanner object to read input from the user
        int attempts = 0;

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Masukkan Password: ");
            String inputPassword = inputReader.nextLine();  // Read the password input

            if (hashPassword(inputPassword).equals(SAVED_HASHED_PASSWORD)) {
                System.out.println("Akses Diberikan!");
                inputReader.close();  // Close the Scanner after successful login
                return;
            } else {
                attempts++;
                System.out.println("Kata Laluan Salah. Percubaan yang tinggal: " + (MAX_ATTEMPTS - attempts));
            }
        }

        System.out.println("Terlalu banyak percubaan yang gagal. Akses ditolak.");
        inputReader.close();  // Close the Scanner after exceeding the allowed attempts
    }

    // Function to simulate password hashing (replace with actual hashing logic in real-world applications)
    private static String hashPassword(String password) {
        return Integer.toString(password.hashCode());  // Simple hash for demonstration
    }
}
