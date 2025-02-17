import java.util.Scanner;

public class Password{
    public static void main(String[] args){
        String correctpassword = "P@55w0rd";
        int maxattempts = 3;
        Scanner key = new Scanner(System.in);
        int attempts = 0;
        
        while (attempts < maxattempts) {
            System.out.print("Sila masukkan kata laluan anda: ");
            String input = key.nextLine();

            if (input.equals(correctpassword)) {
                System.out.println("Log masuk berjaya!");
                return;
            } else {
                attempts++;
                System.out.print("Kata laluan tidak tepat, sila cuba lagi. ");
                System.out.print("Anda berbaki " + (maxattempts - attempts));
                System.out.println(" cubaan lagi.");
            }
        }
        System.out.println("Maaf, Sila cuba lagi selepas beberapa jam.");
        key.close();
    }
}