package sum4;

public class Sum4 {
    
    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<=10;i++){
            int square = i * i;
            System.out.println(i + "^2 = " + square);
            sum += square;
        }

        System.out.println("\nThe total sum of squares from 1 to 10 is: " + sum);
    }

    
}
