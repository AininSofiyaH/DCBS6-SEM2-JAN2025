public class SumNumbers {
    public static void main(String[] args) {
        
        int sumFor = 0;
        for (int i = 1; i <= 10; i++) {
            sumFor += i;
        }
        System.out.println(" for : " + sumFor);

        
        int sumWhile = 0;
        int countWhile = 1;
        while (countWhile <= 10) {
            sumWhile += countWhile;
            countWhile++;
        }
        System.out.println(" while : " + sumWhile);

        
        int sumDoWhile = 0;
        int countDoWhile = 1;
        do {
            sumDoWhile += countDoWhile;
            countDoWhile++;
        } while (countDoWhile <= 10);
        System.out.println("do-while: " + sumDoWhile);
    }
}
