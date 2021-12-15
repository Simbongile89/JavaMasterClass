/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seriesttest;

/**
 *
 * @author simbongile.mbombo
 */
public class Main {
   
    public static void main(String[] args) {
        for (int i=0; i <=10; i++) {
            System.out.println(Series.nSum(i));
        }

        System.out.println("*************************");
        for (int i= 0; i<= 10; i++) {
            System.out.println(Series.factorial(i));
        }
        System.out.println("****************************");
        for (int i=0; i<=10; i++) {
            System.out.println(Series.fibonacci(i));
        }
    }
}
