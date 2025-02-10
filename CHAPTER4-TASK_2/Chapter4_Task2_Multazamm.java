public class Chapter4_Task2_Multazamm {
    public static void main(String[] args) {
        System.out.println("For loop:");
        int initial = 0;
        for (int a = 1; a <= 10; a++) {
            initial = initial + a;
        }
        System.out.println("Sum of 1 to 10 = " + initial);

        System.out.println("\nWhile loop:");
        int init= 0;
        int b = 1;
        while ( b<= 10) {
            init = init + b;
            b++;
        }
        System.out.println("Sum of 1 to 10: " +init);

        
        System.out.println("\nDo-while loop:");
        int ini = 0;
        int c = 1;
        do {
            ini = ini + c;
            c++;
        } while (c <= 10);
        System.out.println("Sum of 1 to 10: " + ini);
    }
}
