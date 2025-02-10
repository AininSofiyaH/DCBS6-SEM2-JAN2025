class SumExample {
    public static void main(String[] args) {
        int sumFor = 0;
        for (int L = 1; L <= 10; L++) {
            sumFor += L;
        }
        System.out.println("Sum using for loop: " + sumFor);

        int sumWhile = 0;
        int w = 1;
        while (w <= 10) {
            sumWhile += w;
            w++;
        }
        System.out.println("Sum using while loop: " + sumWhile);

        int sumDoWhile = 0;
        int d = 1;
        do {
            sumDoWhile += d;
            d++;
        } while (d <= 10);
        System.out.println("Sum using do-while loop: " + sumDoWhile);
    }
}
