/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundopc;

import co.com.jdosorio.mundopc.*;

/**
 *
 * @author ASUS
 */
public class MundoPC {

    public static void main(String[] args) {

        Monitor mon1 = new Monitor("HP", 13);
        Teclado tec1 = new Teclado("Bluetooth", "HP");
        Raton rat1 = new Raton("Bluetooth", "HP");
        Computadora compuHP = new Computadora("HP", mon1, tec1, rat1);

        Monitor mon2 = new Monitor("HP", 20);
        Teclado tec2 = new Teclado("Bluetooth", "Gamer");
        Raton rat2 = new Raton("Bluetooth", "Gamer");
        Computadora compuGamer = new Computadora("Gamer", mon2, tec2, rat2);

        Orden o1 = new Orden();
        o1.agregarComputadora(compuHP);
        o1.agregarComputadora(compuGamer);
        
        o1.mostrarOrden();
        
    }

}
