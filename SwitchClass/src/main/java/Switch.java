/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author simbongile.mbombo
 */
public class Switch {
    
    public static void main(String[] args) {
        
        String Event="October", 
                January,February,June,September,December;
        
        switch (Event){
            case  "January":
                System.out.println("New years eve");
                break;
                
            case "February":
                System.out.println("Valentines day");
                break;
                
            case "June":
                System.out.println("Youth day..June 16");
                break;
                
            case "September":
                System.out.println("Haritage Month");
                break;
                
            case "December":
                System.out.println("Christmass");
                
                break;
            default:
                System.out.println("There is no event on this Month");
        }
        
        
    }
    
}
