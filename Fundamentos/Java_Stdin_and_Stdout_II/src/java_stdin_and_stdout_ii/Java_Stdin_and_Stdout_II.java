/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_stdin_and_stdout_ii;

/**
 *
 * @author jesgo
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Java_Stdin_and_Stdout_II {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = null;
        Scanner into = new Scanner(System.in);
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        
        int n =  into.nextInt();
        Double  d = into.nextDouble();
    
        
        try {
            s1 = s.readLine();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Java_Stdin_and_Stdout_II.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
                    
            
        System.out.println("String: " + s1);
        System.out.println("Double: " + d);
        System.out.println("Int: " + n);

    }
    
}
