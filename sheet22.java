/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication1;
//import java.util.Scanner;
/**
 *
 * @author MOFREH
 */
public class sheet22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        float [][]arr={{1,2,3},{4,5,6}};
        for(int i=0;i<2;i++)
        {
        for(int j=0;j<3;j++)
        {
        System.out.print(arr[i][j]+"  ");
        }
        System.out.println("");
        }
        //*************************************
        
        System.out.println("******************");

        for(int i=0;i<3;i++)
        {
        for(int j=0;j<2;j++)
        {
        System.out.print(arr[j][i]+"  ");
        }
        System.out.println("");
        }
        
        System.out.println("******************");
        
           
    }
}
