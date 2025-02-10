//ilham munsif
public class LoopSum {
    public static void main(String[] args) {
        // for
        int sumfor = 0;
        for (int i = 1; i <= 10; i++) {
            sumfor += i;
        }
        System.out.println("Sum using for loop: " + sumfor);

        // while
        int sumwhile = 0;
        int x = 1;
        while (x <= 10) {
            sumwhile += x;
            x++;
        }
        System.out.println("Sum using while loop: " + sumwhile);

        // do while
        int sumdowhile = 0;
        int y = 1;
        do {
            sumdowhile += y;
            y++;
        } while (y <= 10);
        System.out.println("Sum using do-while loop: " + sumdowhile);
    }
}
