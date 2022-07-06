
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.InternalFrameFocusTraversalPolicy;
import org.w3c.dom.ls.LSOutput;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jesgo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        ArrayList<Integer> lista;
//        lista = new ArrayList<>();
//        
//        lista.add(3);
//        lista.add(120);
//        
//        System.out.println(lista.size());
//        System.out.println(lista);
//        lista.remove(0);
//        lista.add(88);
//        lista.add(74);
//        lista.add(56);
//        System.out.println(lista);
//        System.out.println("boolean " + lista.remove(new Integer(88)));
//        System.out.println(lista);
//        System.out.println(lista.get(0));
//        lista.set(2,200);
//        System.out.println(lista);
       
     ArrayList<Producto> listaProducto = new ArrayList<Producto>();
     
     listaProducto.add(new Producto(1, "manzana", 5000.0f, 25));
     listaProducto.add(new Producto(2, "limon", 2300.0f, 15));
     listaProducto.add(new Producto(3, "peras", 2700.0f, 33));
     listaProducto.add(new Producto(4, "Naranja", 12000.0f, 24));
     listaProducto.add(new Producto(5, "arandanos", 9300, 50));
     listaProducto.add(new Producto(6, "Fresas", 450.0f, 40));
     listaProducto.add(new Producto(7, "helado", 4500.0f, 9));
     listaProducto.add(new Producto(8, "Galletas", 500.0f, 10));
     listaProducto.add(new Producto(9, "Chocolate", 3500.0f, 80));
     listaProducto.add(new Producto(10, "jamon", 15000.0f, 10));
     
        System.out.println(listaProducto);
        
    //imprimir lista de objetos
  /*  for (int i=0; i < listaProducto.size(); i++){
        System.out.println(listaProducto.get(i).mostrarDatos());
    }*/
    float total = 0.0f;
    for(Producto p:listaProducto){
        System.out.println(p.mostrarDatos());
        total += p.getPrice()*p.getInventario();
    }   
        System.out.println("\nCantidad de Productos: "+listaProducto.size());
        System.out.println("\nTotal: $"+total);
    
    //buscar un producto
    
    /*Scanner x =new Scanner(System.in);
    System.out.println("\nIngrese el codigo: ");
    int cod = x.nextInt();
    boolean res = false;
    for(Producto p:listaProducto){
        if(p.getCodigo() == cod){
            System.out.println("Se encontro el producto.\n");
            System.out.println(p.mostrarDatos());
            System.out.println("\n");
            res = true;
            break;
        }else{
            res = false;
        }
    }
    if(res == false){
        System.out.println("Producto no encontrado.");
    }
    */
    //modificar lista
    
    
    listaProducto.set(0, new Producto(11, "Yogurt", 2500.0f, 6));
        System.out.println(listaProducto.get(0).mostrarDatos());
    
}
}
