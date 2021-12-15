/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parsingvaluesfromstring;

/**
 *
 * @author simbongile.mbombo
 */
public class Main {
   
     public static void main(String[] args) {
        String numberAsString ="2018";
        System.out.println("numberAsString =" + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString =" + numberAsString);
        System.out.println("number = " + number);
    }
}
