
package switchcase;

import java.util.Scanner;

/**
 *
 * @author simbongile.mbombo
 */

public class SwitchCase {

   
    public static void main(String[] args) {
        
         String month;
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter Month of the Year");
        
       month=  sc.nextLine();
       
       
        
        
        
        switch (month){
            case "January":
                System.out.println("Schools are opening soon");    
            break;
            case "February":
                System.out.println("Valentines day will be on the 14th");
                break;
                
            case "September":
                System.out.println("Heritage Month");
                break;
            case "June":
                System.out.println("We have  a June 16 holiday");
                break;
                
            case "December":
                System.out.println("We are loking for Bonuses");
                break;
            default:
                
                System.out.println("This yera is a pandemic");
        }
        
        
        
        
        
    }
    
}
