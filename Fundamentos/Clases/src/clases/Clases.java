/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 *
 * @author jesgo
 */
public class Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ImprimeInfo persona1 = new Persona();

        persona1.Nombre = "Jesus";
        persona1.Apellido = "Gonzalez";

        persona1.ImprimeInfo();
    }

}
