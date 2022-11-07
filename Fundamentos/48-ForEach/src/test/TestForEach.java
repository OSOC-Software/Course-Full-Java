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
public class TestForEach {

    public static void main(String[] args) {

        int edades[] = {12, 234, 5, 243, 4, 123};
        //for (int i = 0; i < edades.length; i++) {
        for (int edad : edades) {
            System.out.println(edad);
        }

        Persona personas[] = {new Persona("Juan"), new Persona("Karla"), new Persona("Agustín")};
        for (Persona per : personas) {
            System.out.println("per = " + per);
        }

    }

}
