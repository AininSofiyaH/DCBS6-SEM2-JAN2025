public class SumCalc {
//MUHAIMIN BIN MAHADI
    public static void main(String[] args) {
        int sum = 0, i = 1;

        // Using for loop
        for (i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum using for loop: " + sum);

        
        // Using while loop
        sum = 0; i = 1;
        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println("Sum using while loop: " + sum);

        
        // Using do-while loop
        sum = 0; i = 1;
        do {
            sum += i;
            i++;
        } while (i <= 10);
        System.out.println("Sum using do-while loop: " + sum);
    }
}
