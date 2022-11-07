/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author ASUS
 */
public class Escritor extends Empleado {

    final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", tipo escritura: " + this.tipoEscritura.getDescripcion();
    }

    @Override
    public String toString() {
        return super.toString() + ", Escritor{" + "tipoEscritura=" + tipoEscritura + '}';
    }
    
    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }

}
