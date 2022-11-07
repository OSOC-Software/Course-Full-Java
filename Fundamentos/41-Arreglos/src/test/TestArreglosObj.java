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
public class TestArreglosObj {

    public static void main(String[] args) {
        Persona ps[] = new Persona[2];
        System.out.println("ps = " + ps);
        for (var i = 0; i < ps.length; i++) {
            ps[i] = new Persona("Juan");
            System.out.println("ps[i] = " + ps[i].toString());
        }

        String frutas[] = {"Naranja", "Platano", "Uva", "Pera"};
        System.out.println("frutas = " + frutas.toString());

        for (var i = 0; i < frutas.length; i++) {
            System.out.println("Frutas " + i + " " + frutas[i]);
        }

    }

}
