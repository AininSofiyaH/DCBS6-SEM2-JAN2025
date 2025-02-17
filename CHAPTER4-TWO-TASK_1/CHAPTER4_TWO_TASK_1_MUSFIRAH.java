/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package looptask2a_chap4;

/**
 *
 * @author Damia
 */
import java.util.Scanner;
public class LoopTask2a_Chap4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String passw = "Pass", conpass;
        int count = 5;
        Scanner password = new Scanner(System.in);
        
        do {
            System.out.println("Please Enter password:"); //ループ開始トリガー
            conpass = password.nextLine();
            
            if (conpass.equals(passw)) {
                System.out.println("Welcome to the student portal website!");
                break;
            } else {
                count--;
                System.out.println("Error password");
                System.out.println("You can try enter another password " + count + " left");
                
            }
            
            if (count == 0) {
                System.out.println("System exited");
                break; // システムを終了するためのブレーク
            }

        } while (count >= 0); // countが0以下になった場合にループを終了
        
    }
}