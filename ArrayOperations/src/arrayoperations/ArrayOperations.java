
package arrayoperations;

/**
 *
 * @author simbongile.mbombo
 */
public class ArrayOperations {

    
    public static void main(String[] args) {
        
   StringBuilder sb = new StringBuilder("Hello");
   
        System.out.println("String sb: "+sb);
        
        sb.append("world");
        
        System.out.println("String sb: "+ sb);
        
        sb.append("! ").append("  are ").append(" you?");
        
         System.out.println("String sb: "+ sb);
        
         sb.insert(12, " How");
          System.out.println("String sb: "+ sb);
          
          System.out.println("Length:  "+ sb.length());
          
          System.out.println("Sb:  " + sb.substring(0,10));
          
          System.out.println("Index  "+ sb.indexOf("y"));
        
        
}
    
}
