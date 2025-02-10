public class Chapter4_Task3_Multazam {
    public static void main(String[] args) {
        int Even = 0;
        int Odd = 0;

        for (int a = 2; a <= 10; a = a + 2) 
            Even = Even + a;
        for (int a = 1; a <= 9; a = a + 2) 
            Odd = Odd + a;

        System.out.println("Sum of even numbers: " + Even);
        System.out.println("Sum of odd numbers: " + Odd);
    }
}

