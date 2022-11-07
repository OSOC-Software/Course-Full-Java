/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author ASUS
 */
public class Caja {

    int profundo;
    int ancho;
    int alto;

    Caja() {
    }

    Caja(int ancho, int alto, int profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }

    public int calcularVolumen() {
        return (alto * ancho * profundo);
    }

}
