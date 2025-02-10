class Task2 {
    public static void main(String[] args) {
        int sum = 0;

        System.out.println("For Loop:");
        sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);

        System.out.println();

        System.out.println("While Loop:");
        sum = 0;
        int j = 1;
        while (j <= 10) {
            sum += j;
            j++;
        }
        System.out.println("Sum = " + sum);

        System.out.println();

        System.out.println("Do-While Loop:");
        sum = 0;
        int k = 1;
        do {
            sum += k;
            k++;
        } while (k <= 10);
        System.out.println("Sum = " + sum);
    }
}
