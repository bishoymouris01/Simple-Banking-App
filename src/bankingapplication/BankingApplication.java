/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankingapplication;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class BankingApplication {

    /**
     * @param args the command line arguments
     */
    
    
    /* The application displays a welcome messages to the use with their name. Then, give the use the option to 
    check balance, deposit, withdraw, check previous transactions, and exit*/
    
    public static void main(String[] args) {
        System.out.print("Please enter your name: ");
        Scanner sc3 = new Scanner(System.in);
        String name = sc3.nextLine();
        
        System.out.print("Please enter your Bank ID: ");
        String BankID = sc3.nextLine();
        BankAcc acc1= new BankAcc(name, BankID);
         acc1.ShowMenu();
    }
    
}
