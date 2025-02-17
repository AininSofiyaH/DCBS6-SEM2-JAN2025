public class power_of_2 {
    public static void main(String[] args) {

        int sum_result = 0;
        int result;
        for (int i = 1; i <= 10; i ++ ) {
            result = square(i);
            sum_result += square(i);
            System.out.println(result);

        } System.out.println("Sum of power of 2 is " +sum_result);
    }

    public static int square(int y) {
        return y * y;
    }
}