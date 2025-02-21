/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task4loop_chap4;

/**
 *
 * @author Damia
 */
import java.util.Scanner;
public class Task4loop_chap4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int odd = 0,even = 0,hantei = 0,sequi,keta,digit = 0;
        String answer,cont;
        Scanner kanri = new Scanner(System.in);
        do {
            odd = 0;
            even = 0;
            hantei = 0 ;//初期化
            System.out.println("Please Enter integer:"); 
            sequi = kanri.nextInt();
            keta = sequi;//代入
             while (keta != 0) {
             digit = sequi % 10;
            hantei = digit % 2;
            if(hantei == 0){
                even++;
                        }
            else{
                odd++;
                        }
            keta /= 10;
             }
            System.out.println("odd:"+odd);
            System.out.println("even:"+even);
            kanri.nextLine();
            System.out.println("Do you want to exit ? (y/n): ");
            cont = kanri.nextLine();
            
             } while (!"y".equals(cont));
    
    }
}