class Task1 {
    public static void main(String[] args) {
        System.out.println("Using For Loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n");
        System.out.println("Using While Loop:");
        int j = 1;
        while (j <= 10) {
            System.out.print(j + " ");
            j++;
        }

        System.out.println("\n");
        System.out.println("Using Do-While Loop:");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 10);
    }
}