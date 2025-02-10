public class LoopOne {
    public static void main(String[] args) {
        
//for
        System.out.println("for loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        
//while        
        System.out.println("while loop:");
        int x = 1;
        while (x <= 10) {
            System.out.print(x + " ");
            x++;
        }
        System.out.println("\n");
        
//dowhile        
        System.out.println("do-while loop:");
        int y = 1;
        do {
            System.out.print(y + " ");
            y++;
        } while (y <= 10);
        System.out.println();
    }
}
