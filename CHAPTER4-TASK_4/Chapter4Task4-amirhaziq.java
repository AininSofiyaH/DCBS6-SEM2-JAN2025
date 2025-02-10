public class Chapter4Task4 {
    public static void main(String[] args) {
        int sum = 0; 
        

        System.out.println("Integers from 1 to 10 and their squares:");
        for (int i = 1; i <= 10; i++) {
            int kuasadua = i * i; 
            System.out.println(i + "^2 = " + kuasadua); 
            sum += kuasadua; 
        }

        
        
        System.out.println("Sum of squares from 1 to 10: " + sum);
    }
}
