import java.util.Scanner;

public class SmallPassword {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        final String CORRECT_PASSWORD = "ikan123"; // Kata laluan yang betul
        int attempts = 3; // Had percubaan

        while (attempts > 0) {
            System.out.print("Masukkan kata laluan: ");
            String inputPassword = read.nextLine();

            if (inputPassword.equals(CORRECT_PASSWORD)) {
                System.out.println("Kata Laluan Diterimaa Bro!");
                break;
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Kata Laluan Salah, Baki Percubaan: " + attempts);
                } else {
                    System.out.println("Akaun Dikunci. Banyak Sangat Percubaan, Sila Cuba Nanti.");
                }
            }
        }

        read.close();
    }
}
