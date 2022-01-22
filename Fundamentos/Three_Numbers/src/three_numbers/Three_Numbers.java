/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package three_numbers;
import java.util.*;
/**
 *
 * @author jesgo
 * get three number and returned the  result of multiplication
 *
 */
public class Three_Numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, num3, rslt;
        Scanner entrada = new Scanner(System.in);
        boolean cont = true ;

    do{
        try {
            System.out.println("Ingrese el Primer número para ejecutar operación: ");
            num1 = entrada.nextInt();
        }catch (InputMismatchException ex){
            System.out.println("Por favor ingrese un número valido: ");
            entrada.next();
            cont =  true;
        }
    }while (cont);
        
    }
}