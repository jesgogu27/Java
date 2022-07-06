/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopolimorfismo;

/**
 *
 * @author jesgo
 */
public class VehiculoDeportivo extends Vehiculo{
    private int cilindrada;

    public VehiculoDeportivo(int cilindrada, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

 
  

    @Override
    public String mostrarDatos() {
        String datos;
        datos = "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+ "\nCilindradas: "+cilindrada;
        return datos; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
