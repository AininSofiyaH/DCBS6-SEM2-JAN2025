public class Chapter4Task2 {
    public static void main(String[] args) {
        // for loop
        int sumFor = 0;
        for (int i = 1; i <= 10; i++) {
            sumFor += i;
        }
        System.out.println("Sum for loop: " + sumFor);

        // while loop
        int sumWhile = 0;
        int j = 1;
        while (j <= 10) {
            sumWhile += j;
            j++;
        }
        System.out.println("Sum while loop: " + sumWhile);

        // dowhile loop
        int sumDoWhile = 0;
        int k = 1;
        do {
            sumDoWhile += k;
            k++; 
        } while (k <= 10); 
        System.out.println("Sum dowhile loop: " + sumDoWhile);
    }
}
        
    