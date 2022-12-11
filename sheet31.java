/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author MOFREH
 */
import java.util.Scanner;
public class sheet31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
       
        Scanner input=new Scanner(System.in);
         String phase=input.nextLine();
            String str=phase.replace(",", " ");
            System.out.println(str);
       
    }
}
