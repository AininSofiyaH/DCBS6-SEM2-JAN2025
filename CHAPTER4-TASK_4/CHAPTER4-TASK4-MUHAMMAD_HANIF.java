class Task3Chapter4 {
    public static void main(String[] args) {
        int evenSum = 0, oddSum = 0;

        System.out.println("Even integers:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                evenSum += i;
            }
        }

        System.out.println("\nSum of even integers: " + evenSum);

        System.out.println("\nOdd integers:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                oddSum += i;
            }
        }

        System.out.println("\nSum of odd integers: " + oddSum);
    }
}