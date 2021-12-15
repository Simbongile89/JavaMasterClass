/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sum3and5challenge;

/**
 *
 * @author simbongile.mbombo
 */
public class Main {
    public static void main(String[] args) {

        int count = 0;
        int sum =0;

        for (int i=1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("Found number = " + i);
            }

            if (count == 5) {
                break;
            }
        }

        System.out.println("Sum = " + sum);
    } 
}
