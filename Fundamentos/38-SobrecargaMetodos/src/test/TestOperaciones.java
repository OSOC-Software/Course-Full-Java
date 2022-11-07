/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author ASUS
 */
public class TestOperaciones {

    public static void main(String[] args) {
        var res1 = operaciones.Operaciones.sumar(4, 8);
        System.out.println("res1 = " + res1);
        var res2 = operaciones.Operaciones.sumar(4.3, 8.4);
        System.out.println("res2 = " + res2);
    }

}
