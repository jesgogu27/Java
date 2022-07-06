/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package retotienda;

import static java.lang.System.in;

/**
 *
 * @author jesgo
 */
public class RetoTienda {

    /**
     * @param args the command line arguments
     */
    
    public static int [] estadisticaCompra(int [] compra1){
        int costotoal = 0;
        int costoMenor = 0;
        int costoMayor = 0;
        int banderaMenor = compra1[0];
        int banderaMayor = 0;
        
        
        for (int i = 0; i < compra1.length; i++){
            
            costotoal += compra1[1];
            
            if(compra1[i] > banderaMayor){
                banderaMayor = compra1[i];
            }
            
           
            
            if(compra1[i] < banderaMenor){
                banderaMenor = compra1[i];
            }
            
        }
        
        int[] resultado = {costotoal, costoMenor, costoMayor};
        
        return (resultado);
                
                
   
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int [] compra1 = {2700, 9500, 300, 15000, 1800, 10000, 400, 3000, 400};
        int [] r = {};
        
        r = estadisticaCompra(compra1);
        for(int p:r){
            System.out.println(p);
        }
    }
    
}
