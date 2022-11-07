/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dominio.*;

/**
 *
 * @author ASUS
 */
public class PersonaPrueba {

    public static void main(String[] args) {
        Persona p1 = new Persona("Juan Diego");
        imprimir(p1);
        Persona p2 = new Persona("Peter");
        imprimir(p2);
    }

    public static void imprimir(Persona persona) {
        System.out.println("persona: " + persona.toString());
    }

}
