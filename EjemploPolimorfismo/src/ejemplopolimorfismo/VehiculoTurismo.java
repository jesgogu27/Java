/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopolimorfismo;

/**
 *
 * @author jesgo
 */
public class VehiculoTurismo extends Vehiculo {
    private int numeroPuertas;

    public VehiculoTurismo(int numeroPuertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String mostrarDatos() {
        String datos;
        datos = "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+ "\nNúmero de Puertas: "+numeroPuertas;
        return datos; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
}
