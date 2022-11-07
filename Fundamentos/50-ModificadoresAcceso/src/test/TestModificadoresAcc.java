/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import paquete1.Clase1;
import paquete1.Clase2;
import paquete2.ClaseHija;

/**
 *
 * @author ASUS
 */
public class TestModificadoresAcc {

    public static void main(String[] args) {

        Clase1 c1 = new Clase1();
        c1.metodoPublico();

        ClaseHija ch = new ClaseHija();
        System.out.println("ch = " + ch);

        //ClaseDefault cd = new ClaseDefault(); Error, no es posible acceder por que esta por default
        ClaseDefaultTest cd = new ClaseDefaultTest(); // Sin error, Clase en mismo paquete

        Clase2 c2 = new Clase2("Juan");
        System.out.println("c2 = " + c2);
        
    }

}
