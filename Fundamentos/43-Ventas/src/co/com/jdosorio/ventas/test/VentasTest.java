/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.jdosorio.ventas.test;

import co.com.jdosorio.ventas.*;

/**
 *
 * @author ASUS
 */
public class VentasTest {

    public static void main(String[] args) {

        Producto p1 = new Producto("Camisa", 50.0);
        Producto p2 = new Producto("Pantalon", 100.0);

        Orden o1 = new Orden();
        o1.agregarProducto(p1);
        o1.agregarProducto(p2);
        o1.mostrarOrden();
        
    }

}
