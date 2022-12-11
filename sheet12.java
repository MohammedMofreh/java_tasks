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
public class sheet12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        System.out.println("hellow");
        int fact=1;
       Scanner input1=new Scanner(System.in);
       int n=input1.nextInt();
        Scanner input2=new Scanner(System.in);
       int r=input2.nextInt();
       for(int i=1;i<=n;i++)
       {
       fact=fact*i;
       }
       int factn=fact;
        fact=1;
       for(int i=1;i<=r;i++)
       {
       fact=fact*i;
       }
       int factr=fact;
       fact=1;
       int sub=n-r;
       for(int i=1;i<=sub;i++)
       {
       fact=fact*i;
       }
       int factsub=fact;
       float nCr,nPr;
       nPr=factn/factsub;
       nCr=factn/(factr*factsub);
       System.out.println("nPr ="+nPr);
       System.out.println("nCr ="+nCr);
    }
}
