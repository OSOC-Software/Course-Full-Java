/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author ASUS
 */
public class pruebaPersona {

    public static void main(String[] args) {

        Persona p1 = new Persona();
        p1.apellido = "Osorio C";
        p1.nombre = "Juan";
        p1.desplegarInformacion();
        System.out.println("persona 1: = " + p1);
    }

}
