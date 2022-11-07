/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.PersonaBean;

/**
 *
 * @author ASUS
 */
public class TestJavaBeans {

    public static void main(String[] args) {
        PersonaBean p1 = new PersonaBean();
        p1.setApellido("Osorio C");
        p1.setNombre("Juan D");
        System.out.println(p1.toString());
    }
}
