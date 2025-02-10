public class task1 {
    public static void main(String[] args) {
        
        System.out.println(" for :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        
        System.out.println("while :");
        int count = 1;
        while (count <= 10) {
            System.out.println(count);
            count++;
        }

        
        System.out.println(" do-while :");
        int doWhileCount = 1;
        do {
            System.out.println(doWhileCount);
            doWhileCount++;
        } while (doWhileCount <= 10);
    }
}
