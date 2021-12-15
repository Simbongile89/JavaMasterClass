/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.accessmodifiers;

/**
 *
 * @author simbongile.mbombo
 */
public class Main {
    
    public static void main(String[] args) {
         Account leesAccount = new Account("Lee");
        leesAccount.deposit(1000);
        leesAccount.withdraw(500);
        leesAccount.withdraw(-200);
        leesAccount.deposit(-20);
        leesAccount.calculateBalance();
        leesAccount.balance = 5000;

        System.out.println("Balance on account is " + leesAccount.getBalance());
        leesAccount.transactions.add(4500);
        leesAccount.calculateBalance();
    }
}
