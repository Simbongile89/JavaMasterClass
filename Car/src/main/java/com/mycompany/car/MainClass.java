/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.car;

/**
 *
 * @author simbongile.mbombo
 */
public class MainClass {
    
    
    public static void main(String[] args) {
        
        Car mercedes = new Car();
        Car Audi = new Car();
        mercedes.setModel("V.class"); 
        System.out.println("Model is " + mercedes.getModel()); 
    }
    
}
