/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Persona;

/**
 *
 * @author ASUS
 */
public class TestFinal {

    public static void main(String[] args) {

        // Variables
        final int v1 = 10;
        System.out.println("v1 = " + v1);
        //v1 = 12; Error por marcado de variable como Final
        //Persona.MI_CONSTANTE = 12; Error
        System.out.println(Persona.MI_CONSTANTE);
        final Persona p1 = new Persona();
        //p1 = new Persona(); Error por marcado como final
        p1.setNommbre("Juan");
        System.out.println("p1 nombre 1= " + p1.getNommbre());
        p1.setNommbre("Juan Diego");
        System.out.println("p1 nombre 2= " + p1.getNommbre());
    }
}
