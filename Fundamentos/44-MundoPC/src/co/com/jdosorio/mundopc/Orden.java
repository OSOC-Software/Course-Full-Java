/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.jdosorio.mundopc;

/**
 *
 * @author ASUS
 */
public class Orden {

    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private static final int MAX_COMPUTADORAS = 10;
    private int contadorComputadoras;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora comp) {
        if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++] = comp;
        } else {
            System.out.println("Se ha superado el limite. Limite max: " + Orden.MAX_COMPUTADORAS);
        }
    }

    public void mostrarOrden() {

        System.out.println("Orden #" + this.idOrden);
        System.out.println("computadoras de la orden");
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i].toString());
        }

    }

}
