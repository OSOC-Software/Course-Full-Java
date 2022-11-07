/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Cliente;
import domain.Empleado;
import domain.Persona;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class TestHerencia {

    public static void main(String[] args) {
        Empleado e1 = new Empleado("Juan Deigo", 50000.0);
        System.out.println("e1 = " + e1);
//        Date fecha = new Date();
//        Cliente c1 = new Cliente("Juan diego", 'M', 28, "Calle falsa 123", fecha, true);
//        System.out.println("c1 = " + c1.toString());
//
//        Persona p1 = new Persona();
    }
}
