/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.constructor;

/**
 *
 * @author simbongile.mbombo
 */
public class VIPPerson {
     private String name;
    private double creditLimit;
    private String emailAddress;

    public VIPPerson() {
        this("Default name", 50000.00, "default@email.com");
    }

    public VIPPerson(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    public VIPPerson(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    
}
