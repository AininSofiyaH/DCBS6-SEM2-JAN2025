public class Demo4 {
    public static void main(String[] args) {
        int sumFor = 0;
        for (int i = 1; i <= 10; i++) {
            sumFor += i;
        }
        System.out.println("Sum using for loop: " + sumFor);

        int sumWhile = 0;
        int iWhile = 1;
        while (iWhile <= 10) {
            sumWhile += iWhile;
            iWhile++;
        }
        System.out.println("Sum using while loop: " + sumWhile);

        
        int sumDoWhile = 0;
        int iDoWhile = 1;
        do {
            sumDoWhile += iDoWhile;
            iDoWhile++;
        } while (iDoWhile <= 10);
        System.out.println("Sum using do-while loop: " + sumDoWhile);
    }
}
