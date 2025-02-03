import java.util.Scanner;
//MUHAIMIN BIN MAHADI DCBS6
class FinalMarks{
    public static void main(String[] args){
        Scanner min = new Scanner(System.in);
        System.out.println("========= GMI =========");
        System.out.print("Enter your final mark: ");
        int mark = min.nextInt();
        
        if (mark >= 90){
            System.out.println("Your mark is A+");
        }else if (mark >= 80){
            System.out.println("Your mark is A");
        }else if (mark >= 70){
            System.out.println("Your mark is A-");
        }else if (mark >= 65){
            System.out.println("Your mark is B+");
        }else if (mark >=60){
            System.out.println("Your mark is B");
        }else if (mark >= 55){
            System.out.println("Your mark is C+");        
        }else if (mark >= 50){
            System.out.println("Your mark is C");        
        }else if (mark >= 45){
            System.out.println("Your mark is D");       
        }else if (mark >= 40){
            System.out.println("Your mark is E");
        }else{
            System.out.println("You FAILLLLLLLLLL");     
}
        min.close();       
    }
}