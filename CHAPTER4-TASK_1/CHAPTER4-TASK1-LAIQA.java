package loopingtask1;
public class LoopingTask1 {
    public static void main(String[] args) {
        //for loop
          System.out.println("For loop:");
        for (int a = 1; a <= 10; a++) {
            System.out.print(a + " ");}
        System.out.println();

        // while loop
        System.out.println("While loop:");
        int b = 1;
        while (b <= 10) {
            System.out.print(b + " ");
            b++;}
        System.out.println();

        //do-while loop
        System.out.println("Do-while loop:");
        int c = 1;
        do {
            System.out.print(c + " ");
            c++;
        } while (c <= 10);

    }
   }