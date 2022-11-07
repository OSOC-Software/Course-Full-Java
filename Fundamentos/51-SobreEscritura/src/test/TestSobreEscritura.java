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
public class TestSobreEscritura {

    public static void main(String[] args) {

        Empleado e1 = new Empleado("Juan", 300000);
        //System.out.println("e1 = " + e1.obtenerDetalles());
        imprimir(e1);

        Gerente g1 = new Gerente("Juan", 61, "Ingenieria");
        //System.out.println("g1 = " + g1.obtenerDetalles());
        imprimir(g1);

    }

    public static void imprimir(Empleado emp) {
        System.out.println("Empleado: ");
    }

}
