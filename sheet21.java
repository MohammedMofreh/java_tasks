/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author MOFREH
 */
public class sheet21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        System.out.println("enter the size of array : ");
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        float []arr=new float[size];
        for(int i=0;i<size;i++)
        {
            System.out.println("enter value of number "+(i+1)+" : ");
        Scanner inputi=new Scanner(System.in);
        arr[i]=inputi.nextInt();
        }
        float max=arr[0];
        for(int i=1;i<size;i++)
        {
        if(max<arr[i])
            max=arr[i];
        }
        System.out.println("the maxmium number : "+ max);
        
    }
}
