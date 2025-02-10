public class chp4_task1 {
    public static void main(String[] args) {

        System.out.println("Printing Numbers from 1 to 10 using for loop");
        for (int a = 1; a <= 10; a++) {
            System.out.println(a);
        }

        int b = 1;
        System.out.println("\nPrinting Numbers from 1 to 10 using while loop");
        while (b <= 10) {
            System.out.println(b++);
        }

        {
            int count = 1;
            System.out.println("\nPrint Numbers from 1 to 10 using do-while loop");
            do {
                System.out.println(count++);
            }
            while (count <= 10);
        }

    }
}