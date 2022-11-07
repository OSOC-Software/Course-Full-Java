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
public class TestInstanceOf {

    public static void main(String[] args) {

        Empleado e1 = new Empleado("Juan", 300000);
        e1 = new Gerente("Juan", 61, "Ingenieria");
        determinarTipo(e1);

    }

    public static void determinarTipo(Empleado emp) {
        if (emp instanceof Gerente) {
            System.out.println("Es de tipo Gerente");
        }
        else if (emp instanceof Empleado) {
            System.out.println("Es de tipo Empleado");
        }
        else if (emp instanceof Object) {
            System.out.println("Es de tipo Object");
        }
    }

}
