/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author MOFREH
 */
import java .util.Scanner;
class BankAccount{

    int previous=0;
    int balance=0;
    String customername;
    String customerid;
    BankAccount(String cn,String ci){
        customername=cn;
        customerid=ci;
                }
    void deposition(int amount){
     if(amount!=0){
     previous=amount;
     balance+=amount;
         System.out.println("customer name : "+customername+"/ customer id : "+customerid);
         System.out.println("your balance is : "+balance);
     }
    }
    void withdraw(int amount){
    if(amount!=0&&amount<=balance){
    previous=(-amount);
    balance-=amount; 
             System.out.println("customer name : "+customername+"customer id : "+customerid);
    System.out.println("your balance is : "+balance);
    }
    }
void previoust(){
if(previous<0){
             System.out.println("customer name : "+customername+"customer id : "+customerid);

    System.out.println("the process is withdraw by value = "+Math.abs(previous));
}
else
{
          System.out.println("customer name : "+customername+"customer id : "+customerid);
   System.out.println("the process is deposit by value = "+Math.abs(previous));
}

}

}

public class sheet42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        System.out.println("enter your name and id");
        Scanner input0=new Scanner(System.in);
        String cn=input0.next();
        String ci=input0.next();
        BankAccount a1=new BankAccount(cn,ci);
        System.out.println("enter 1 for deposit / 2 for withdraw / 3 for previous transaction / 4 for exit");
        Scanner input1=new Scanner(System.in);
        int x;
        do{
         x=input1.nextInt();
        switch(x){
            case 1:
                System.out.println("enter the amount you want to deposit");
                Scanner input2=new Scanner(System.in);
                int amount1=input2.nextInt();
                a1.deposition(amount1);
                break;
            case 2:
                System.out.println("enter the amount you want to withdraw");
                Scanner input3=new Scanner(System.in);
                int amount2=input3.nextInt();
                a1.withdraw(amount2);
                break;
            case 3:
                a1.previoust();
                break;
        }
            System.out.println("press 4 for exit or chosse new process ");
        
        }while(x!=4);
    }
}
