import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Masukkan bilangan pelajar: ");
        int totalStudents = read.nextInt();
        int passed = 0, failed = 0;

        for (int i = 1; i <= totalStudents; i++) {
            int marks;
            do {
                System.out.print("Masukkan markah pelajar " + i + " (0 - 100): ");
                while (!read.hasNextInt()) {
                    System.out.print("Input tidak sah! Masukkan nombor antara 0 hingga 100: ");
                    read.next(); // Buang input salah
                }
                marks = read.nextInt();
            } while (marks < 0 || marks > 100); // Pastikan input dalam julat sah

            if (marks >= 40) {
                passed++;
            } else {
                failed++;
            }
        }

        System.out.println("Bilangan pelajar lulus: " + passed);
        System.out.println("Bilangan pelajar gagal: " + failed);

        if (passed > totalStudents / 2) {
            System.out.println("Bonus to instructor");
        }

        read.close();
    }
}
