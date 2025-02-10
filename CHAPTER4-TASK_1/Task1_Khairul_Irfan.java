public class Task1_Khairul_Irfan {
    public static void main(String[] args) {
        // Menggunakan for loop
        System.out.println("Using for loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        // Menggunakan while loop
        System.out.println("\n\nUsing while loop:");
        int count = 1;
        while (count <= 10) {
            System.out.print(count + " ");
            count++;
        }

        // Menggunakan do while loop
        System.out.println("\n\nUsing do while loop:");
        int docount = 1;
        do {
            System.out.print(docount + " ");
            docount++;
        } while (docount <= 10);

        System.out.println();
    }
}