class LoopingExample {
    public static void main(String[] args) {
        System.out.println("When Using for loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nWhen Using while loop:");
        int j = 1;
        while (j <= 10) {
            System.out.print(j + " ");
            j++;
        }

        System.out.println("\n\nWhen Using do-while loop:");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 10);
    }
}