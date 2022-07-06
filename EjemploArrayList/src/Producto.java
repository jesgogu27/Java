/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jesgo
 */
public class Producto {
    private int codigo;
    private String nombre;
    private float price;
    private int inventario;

    public Producto(int codigo, String nombre, float price, int inventario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.price = price;
        this.inventario = inventario;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrice() {
        return price;
    }

    public int getInventario() {
        return inventario;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }
    
    public String  mostrarDatos(){
        String datos;
        datos = "Código: "+codigo+"\nNombre: "+nombre+"\nPrecio: $"+price+"\nInventario: "+inventario+"\n +Subtotal: $"+inventario*price;
        return datos;
    }
    
}
