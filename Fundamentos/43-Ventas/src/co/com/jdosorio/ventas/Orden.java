/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.jdosorio.ventas;

/**
 *
 * @author ASUS
 */
public class Orden {

    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto pr) {
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            this.productos[this.contadorProductos++] = pr;
        } else {
            System.out.println("Se ha superado el máximo de productos por orden. Máximo de productos: " + Orden.MAX_PRODUCTOS);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            total += this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("Orden #: " + this.idOrden);
        System.out.println("Total Orden: $" + this.calcularTotal());
        System.out.println("Produtos de la orden:");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println("Producto " + this.productos[i].getIdProducto() + ": " + this.productos[i]);
        }

    }
}
