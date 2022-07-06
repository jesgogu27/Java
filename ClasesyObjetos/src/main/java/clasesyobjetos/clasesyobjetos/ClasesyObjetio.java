/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesyobjetos.clasesyobjetos;

import java.util.Scanner;


/**
 *
 * @author asus
 */
public class ClasesyObjetio {

    /**
     * @param datos
     * @return 
     */
    
    /*Se genera una validacion de datos con expresiones regulares*/
    public static boolean validarNumeros(String datos){
        return datos.matches("[0-9]*");
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        int numero, a=0, b=1, aux=1, res, resant2;
        boolean y = false;
        String x;
        
        do{
            System.out.println("Ingrese numero para serie fibonacci:");
            x = entrada.nextLine();
        }while(y == validarNumeros(x));
        
        numero = Integer.parseInt(x);
                if(numero == 0)
        {
            System.out.println(numero);
        }else{
            if(numero==1){
                System.out.println(a);
                System.out.println(numero);
            }else{
                    System.out.println(a);
                    do{
                        res= a+b;
                        System.out.println(res);
                        resant2 = a;
                        aux ++;
                        b=resant2;
                        a=res;
                        
                    }while(numero >= aux);
            
            
                }
            }
    }
}