public class Chapter4_Task1_Multazam {
    public static void main(String[] args) {
        System.out.println("For loop:");
        for (int a = 1; a <= 10; a++) {
            System.out.println(a);
        }

        System.out.println("\nWhile loop:");
        int b = 1;
        while (b <= 10) {
            System.out.println(b++);
        }

        System.out.println("\nDo-while loop:");
        int c = 1;
        do {
            System.out.println(c++);} 
        while (c <= 10);
    }
}