package task3;
public class Task3 {
    public static void main(String[] args) {
        int sumEven = 0, sumOdd = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(" Even: " + i);
                sumEven += i;
            } else {
                System.out.println(" Odd: " + i);
                sumOdd += i;
            }
        }
        System.out.println("Sum of even integers: " + sumEven);
        System.out.println("Sum of odd integers: " + sumOdd);

    }
}
