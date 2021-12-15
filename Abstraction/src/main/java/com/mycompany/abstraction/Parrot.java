/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstraction;

/**
 *
 * @author simbongile.mbombo
 */
public class Parrot extends Bird{
    
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I'm not very good at that, can I go for a swim instead?");
    }
    
}
