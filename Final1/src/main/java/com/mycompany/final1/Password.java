/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.final1;

/**
 *
 * @author simbongile.mbombo
 */
public class Password {
     private static final int key = 748576362;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    public int encryptDecrypt(int password) {
        return password ^ key;
    }

    public final void storePassword() {
        System.out.println("Saving  password as " + this.encryptedPassword);
    }

    public boolean letMeIn(int password) {
        if (encryptDecrypt(password) ==this.encryptedPassword) {
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("Nope, you cannot come in");
            return false;
        }
    }
}
