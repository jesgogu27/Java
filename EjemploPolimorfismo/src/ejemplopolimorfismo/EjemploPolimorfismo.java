/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplopolimorfismo;

/**
 *
 * @author jesgo
 */
public class EjemploPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo  mio = new Vehiculo("ABC", "NISSAN", "xTRAIL");//OBJETO CLASE PADRE
        
        System.out.println(mio.mostrarDatos());
        
        Vehiculo  turis = new VehiculoTurismo(5,"XYX", "CHEVROLET", "SPARK");
        System.out.println(turis.mostrarDatos());
        
        Vehiculo furg = new VehiculoFurgoneta(2000,"QWE456", "CHEVROLET", "CAMION");
        System.out.println(furg.mostrarDatos());
    }
    
}
