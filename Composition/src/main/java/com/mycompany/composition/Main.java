/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.composition;

/**
 *
 * @author simbongile.mbombo
 */
public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
    Case theCase = new Case("220B", "Dell", "240", dimensions);

    Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

    MotherBoard theMotherboard = new MotherBoard("BJ-200", "Asus", 4, 6, "v2.44");

    PC thePC = new PC(theCase, theMonitor, theMotherboard);
    thePC.powerUp();

        

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("Lees", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();
    }
}
    
    

