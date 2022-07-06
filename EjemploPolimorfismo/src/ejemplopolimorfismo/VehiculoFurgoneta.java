/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopolimorfismo;

/**
 *
 * @author jesgo
 */
public class VehiculoFurgoneta extends Vehiculo{
    
    private int carga;

    public VehiculoFurgoneta(int carga, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    @Override
    public String mostrarDatos() {
        String datos;
        datos = "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+ "\nCarga: "+carga;
        return datos; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
