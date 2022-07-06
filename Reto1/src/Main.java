/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jesgo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static int [] reporte(int [] participantes) {
        
        
        int mayor = 0;
        int menor = participantes[0];
        int contadorParticipantes = 0;
        
        for (int i=0; i < participantes.length; i++){
            if(participantes[i] > mayor){
                mayor = participantes[i];
            }
            if(participantes[i]< menor){
                menor = participantes[i];
            }
            contadorParticipantes ++; 
            }
        
        int [] resultado = {contadorParticipantes, menor,mayor};
            
        return  resultado;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] participantes = {19, 22,21,25,32,38,16,31, 30, 26, 19, 17,23};
        int [] r ={};
            
        r = reporte(participantes);
        for(int i=0; i<3;i++){
            System.out.println(r[i]);
        }
        
    }
    
}
