/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

/**
 *
 * @author simbongile.mbombo
 */
public class NewClass {
    public static void main(String[] args) {
         Car mercedes = new Car();
        Car Audi = new Car();
        mercedes.setModel("AMG"); // calling setModel and pass the parameter and updating it with object AMG.
        System.out.println("Model is " + mercedes.getModel());
    }
    }

