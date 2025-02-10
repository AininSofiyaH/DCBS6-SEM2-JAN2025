public class Task2_Khairul_Irfan {
    public static void main(String[] args) {
        // Menggunakan for loop
        int sumFor = 0;
        for (int i = 1; i <= 10; i++) {
            sumFor += i;
        }
        System.out.println("Sum using for loop: " + sumFor);

        // Menggunakan while loop
        int sumWhile = 0;
        int j = 1;
        while (j <= 10) {
            sumWhile += j;
            j++;
        }
        System.out.println("Sum using while loop: " + sumWhile);

        // Menggunakan do while loop
        int sumDoWhile = 0;
        int k = 1;
        do {
            sumDoWhile += k;
            k++;
        } while (k <= 10);
        System.out.println("Sum using do while loop: " + sumDoWhile);
    }
}
