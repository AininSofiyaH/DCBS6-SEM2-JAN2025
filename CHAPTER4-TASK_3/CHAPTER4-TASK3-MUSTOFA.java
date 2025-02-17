public class sum_and_odd {
    public static void main(String[] args) {
        
        int sum_odd = 0;
        System.out.println("\nOdd numbers =");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) //if there's baki, it'll continue
                continue;
            sum_odd += i;
            System.out.println(i);
        }
        System.out.println("Sum of odd numbers = "+sum_odd);

        int sum_even = 0;
        System.out.println("\nEven numbers =");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) //if there's baki, it'll continue
                continue;
            sum_even += i;
            System.out.println(i);
        }
        System.out.println("Sum of even numbers = "+ sum_even);
    }
}