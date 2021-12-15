/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minelementchallenge;

import java.util.Scanner;

/**
 *
 * @author simbongile.mbombo
 */
public class Main {
    
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextInt();

        int[] returnedArray = readIntegers(count);
        int returnedMin = findMin(returnedArray);

        System.out.println("min = " + returnedMin);
    }

    private static int[] readIntegers(int count){
        int[] array = new int[count];
        for(int i=0; i<array.length; i++){
            System.out.println("Enter the number: ");
            int number = scanner.nextInt();
            scanner.nextInt();
            array[i] = number;
        }
        return array;
    }
    private static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i=0; i< array.length; i++){
            int value = array[i];
            if(value<min){
                min = value;
            }
        }
        return min;
    }
}
