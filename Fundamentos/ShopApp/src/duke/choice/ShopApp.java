/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package duke.choice;

/**
 *
 * @author jesgo
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to Duke Choice Shop");
        
        Customer c1 = new Customer();
        Customer c2 = new Customer();
        Customer c3 = new Customer();
//        Customer c4 = new Customer();
        boolean t, t2;
        
        c1.name = "Pinky";
        c2.name = "pinky";
        
        t = c1.name.equalsIgnoreCase(c2.name);
        System.out.println( t);
        
        t2 = c1.name.equals(c2.name);
        System.out.println(t2);
        
        System.out.println("Hello " +  c1.name);
        
        c3.name = c1.name.concat(c2.name);
        System.out.println(c3.name);
        
        int number;
        number = 123_1235_158;
        
        System.out.println(number);
    
        String variable1 = "Como estas";
        
        variable1 = " how are".trim();
        
        System.out.println(variable1);
    
    }

}
