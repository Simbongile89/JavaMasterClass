/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

/**
 *
 * @author simbongile.mbombo
 */
import java.util.Locale;
public class Car {
     //define the five fields
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    // create method to update the model
    // 'this' indicates/refers to the field of the class
    // .equal test if a string is equal to another type '18'
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("amg") || validModel.equals("c lass")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    // creating a getter
    public String getModel() {
        return this.model;
}
}
