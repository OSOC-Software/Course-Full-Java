/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dominio.Persona;

/**
 *
 * @author ASUS
 */
public class PersonaPrueba {

    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", 100.0, false);
        System.out.println("nombre: " + p1.getNombre());
        System.out.println("sueldo: " + p1.getSueldo());
        System.out.println("eliminado: " + p1.isEliminado());

    }

}
