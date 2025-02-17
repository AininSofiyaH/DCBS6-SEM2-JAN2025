package passwordsystem;
import java.util.Scanner;
public class PasswordSystem {
    public static void main(String[] args) {
        Scanner passUser = new Scanner(System.in); //scanner untuk ambil input dari user
        String input,username,correctPass = "aincomeltak07"; //pass yang betul simpan kat variable ni
        
        System.out.println("Enter your username : ");
        username = passUser.nextLine();
        
        //loop 3 kali attempts
        for(int attempts = 3; attempts>0; attempts--){ 
            System.out.println("Enter your password : "); //minta user masukkan password
            input = passUser.nextLine();
            
        //check kalau password tu betul
        if(input.equals(correctPass)){
            System.out.println("Willkommen");
            passUser.close();
            return;            
        }
        //kalau password salah
        {
            System.out.println("Incorrect Password.. Attempts Left : " +attempts);}
        }
        //kalau attempts semua dah habis
        System.out.println("Access Denied!");
    } }
    

