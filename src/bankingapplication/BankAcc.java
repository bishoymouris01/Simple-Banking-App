/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingapplication;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class BankAcc {
    int balance;
    int previoustransaction;
    String cxname;
    String cxID;

    public BankAcc(String cxname, String cxID) {
        this.cxname = cxname;
        this.cxID = cxID;
    }
    
    
    
    void deposit(int amount){
        if(amount != 0){
            balance = balance + amount;
            previoustransaction = amount;
        }
    }
    
    
     void withdraw(int amount){
        if(amount != 0){
            balance = balance - amount;
            previoustransaction = -amount;
        }
    }  
     
      void GetPreviousTransaction(){
        if(previoustransaction > 0){
            System.out.println("Deposited: " + previoustransaction);
        }
        else if(previoustransaction < 0){
            System.out.println("Withdrawn: " + Math.abs(previoustransaction));
        }
        
        else{
            System.out.println("No transaction occured.");
        }
    }
      
      
      void ShowMenu(){
          
          char option = '0';
          Scanner sc = new Scanner(System.in);
          System.out.println("Welcome " + cxname);
          System.out.println("Your ID is: " + cxID);
          System.out.println("\n");
          System.out.println("A. Check Balance");
          System.out.println("B. Deposit");
          System.out.println("C. Withdraw");
          System.out.println("D. View Previous Transaction");
          System.out.println("E. Exit");
          
          do{
              System.out.println("=================================================================");
              System.out.println("Please Pick an Option");
              System.out.println("=================================================================");
              option= sc.next().charAt(0); 
              System.out.println("\n");
              
              switch(option){
                  
                  case 'A' -> {
                      System.out.println("------------------------------------");
                      System.out.println("Balance= "+ balance);
                      System.out.println("------------------------------------");
                      System.out.println("\n");
                  }
                      
                  case 'B' -> {
                      System.out.println("------------------------------------");
                      System.out.println("Enter an amount to deposit");
                      System.out.println("------------------------------------");
                      int amount = sc.nextInt();
                      deposit(amount);
                      System.out.println("\n");
                  }
                      
                  case 'C' -> {
                      System.out.println("------------------------------------");
                      System.out.println("Enter an amount to withdraw:");
                      System.out.println("------------------------------------");
                      int amount2 = sc.nextInt();
                      withdraw(amount2);
                      System.out.println("\n");
                  }
                      
                      
                  case 'D' -> {
                      System.out.println("------------------------------------");
                      GetPreviousTransaction();
                      System.out.println("------------------------------------");
                      System.out.println("\n");
                  } 
                   
                  
                   case 'E' -> {
                      System.out.println("******************************");
                      break;
                  } 
                   
                  default -> System.out.println("Invalid Option! Please try again.");
              }
              
              
          } while(option != 'E');
          
          System.out.println("Thank you for using our services");
          
          
          
      }
}
