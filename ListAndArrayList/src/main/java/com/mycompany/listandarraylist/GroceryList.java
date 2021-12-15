/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listandarraylist;

import java.util.ArrayList;

/**
 *
 * @author simbongile.mbombo
 */
public class GroceryList {
   private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + "items in your grocery list");
        for( int i = 0; i<groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }
    public void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item"  + (position+1) + "has been modified");
    }
    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position >= 0) {
            removeGroceryItem(position);
        }
    }
    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }
    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }
    boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position >= 0){
            return true;
        }
        return false;
    } 
}
