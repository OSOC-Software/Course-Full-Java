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
public class TestConversionObjs {

    public static void main(String[] args) {
        Empleado e1;
        e1 = new Escritor("Juan", 2131314, TipoEscritura.CLASICO);
        System.out.println("e1 = " + e1);

        System.out.println(e1.obtenerDetalles());

        //Downcasting: de clase Padre a clase hija
        //System.out.println(((Escritor) e1).getTipoEscritura());
        Escritor escritor = (Escritor) e1;
        escritor.getTipoEscritura();

        //Upcasting: De clase hija a clase Padre. No es necesario conversion explicita 
        Empleado e2 = escritor;
        System.out.println(e2.obtenerDetalles());

    }

}
