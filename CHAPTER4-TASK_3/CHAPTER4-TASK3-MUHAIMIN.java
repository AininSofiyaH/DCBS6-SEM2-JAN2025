public class Even_Odd_Sum {
///MUHAIMIN BIN MAHADI
    public static void main(String[] args) {
        int even_Sum = 0, odd_Sum = 0;

        System.out.println("Even numbers: ");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                even_Sum += i;
            }
        }
        System.out.println("\nSum of even numbers: " + even_Sum);

        System.out.println("_______________________");
                
        System.out.println("\nOdd numbers: ");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                odd_Sum += i;
            }
        }
        System.out.println("\nSum of odd numbers: " + odd_Sum);
    }
}
