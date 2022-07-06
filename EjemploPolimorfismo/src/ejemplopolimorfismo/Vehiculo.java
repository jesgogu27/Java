/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopolimorfismo;

/**
 *
 * @author jesgo
 */
public class Vehiculo {
    protected String matricula;
    protected String marca;
    protected String modelo;

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public String mostrarDatos(){
        String datos;
        datos = "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo;
        return datos;
        
        
    } 
    
}
