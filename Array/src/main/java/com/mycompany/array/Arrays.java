/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.array;

/**
 *
 * @author simbongile.mbombo
 */
public class Arrays {
    
    public static void main(String[] args) {
        
        String country []= new String[4];
        
        country[0] = "Poland";
        country[1] = "Mexico";
        country[2] = "Jerusalam";
        country[3] = "Bokinafaso";
        
        
        int[] number ={2,4,5,6};
        
        for(String coun: country ){
            System.out.println("Country name:  "+coun);
            
        }
        System.out.println("\n");
        for(int num: number){
            System.out.println("Number:  "+  num);
        }
        
    }
}

    

