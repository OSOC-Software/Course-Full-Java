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
//public final class Persona {
public final class Persona {

    public final static int MI_CONSTANTE = 1;
    private String nommbre;

    public String getNommbre() {
        return nommbre;
    }

    public void setNommbre(String nommbre) {
        this.nommbre = nommbre;
    }

    public final void imprimir() {
        System.out.println("Metodo imprimir, desde metodo final ");
    }
}
