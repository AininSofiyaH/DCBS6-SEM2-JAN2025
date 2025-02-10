package loopingtask2;
public class LoopingTask2 {
    public static void main(String[] args) {
           int sum = 0;

        // For loop
        System.out.println("*For Loop*");
        for (int i = 1; i <= 10; i++) {
            sum += i;}
        System.out.println("Sum: " + sum);

        //while loop
        sum = 0;
        int j = 1;
        System.out.println("*While Loop*");
        while (j <= 10) {
            sum += j;
            j++;}
        System.out.println("Sum: " + sum);

        //Do-while loop
        sum = 0;
        int k = 1;
        System.out.println("*Do-while Loop*");
        do {
            sum += k;
            k++;
        } while (k <= 10);
        System.out.println("Sum: " + sum);
}
    
}
