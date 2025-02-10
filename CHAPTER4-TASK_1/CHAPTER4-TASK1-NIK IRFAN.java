public class Task1 {
    public static void main(String[] args) {
        
        System.out.println("Using for loop:");
        for (int count = 1; count <= 10; count++) {
            System.out.println(count);
        }
       
        System.out.println("\nUsing while loop:");
        int countWhile = 1;
        while (countWhile <= 10) {
            System.out.println(countWhile);
            countWhile++;
        }
        
        System.out.println("\nUsing do-while loop:");
        int countDoWhile = 1;
        do {
            System.out.println(countDoWhile);
            countDoWhile++;
        } while (countDoWhile <= 10);
    }
}
