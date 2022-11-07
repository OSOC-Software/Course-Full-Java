/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoporreferencia;

import clases.Persona;

/**
 *
 * @author ASUS
 */
public class PasoPorReferencia {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.nombre = "Juan Diego";
        p1.apellido = "Osorio Castrillón";
        System.out.println("persona= " + p1.nombre + " " + p1.apellido);
        p1 = cambioValor(p1);
        System.out.println("persona= " + p1.nombre + " " + p1.apellido);
    }

    public static Persona cambioValor(Persona p1) {
        System.out.println("Argumento persona= " + p1.nombre + " " + p1.apellido);
        p1.nombre = "JDOC";
        return p1;
    }

}
