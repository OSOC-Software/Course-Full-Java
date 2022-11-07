/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.*;

/**
 *
 * @author ASUS
 */
public class TestClaseObject {

    public static void main(String[] args) {
        Empleado e1 = new Empleado("juan", 100);
        Empleado e2 = new Empleado("Juan", 100);

        if (e1 == e2) {
            System.out.println("Misma referencia");
        } else {
            System.out.println("Distinta referencia");
        }

        if (e1.equals(e2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }

        if (e1.hashCode() == e2.hashCode()) {
            System.out.println("Hash igual: " + e1.hashCode() + " = " + e2.hashCode());
        } else {
            System.out.println("Hash diferente: " + e1.hashCode() + " = " + e2.hashCode());
        }

    }

}
