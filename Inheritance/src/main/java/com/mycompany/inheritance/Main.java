/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author simbongile.mbombo
 */
public class Main {
    public static void main(String[] args) {
        
         Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Bova", 8, 20, 2, 4, 1, 20, "Duke");
        dog.eat();
        dog.walk();
        dog.run();
    }
}
