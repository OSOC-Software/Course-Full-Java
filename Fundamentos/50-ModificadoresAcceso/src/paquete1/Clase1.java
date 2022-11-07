/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author ASUS
 */
public class Clase1 {

    public String attrPublico = "Attr publico";
    protected String attrProtegido = "Attr protegido";

    public Clase1() {
        System.out.println("Constructor publico");
    }

    protected Clase1(String attrProtegido) {
        this.attrProtegido = attrProtegido;
        System.out.println("Constructor protegido");
    }

    public void metodoPublico() {
        System.out.println("Metodo publico");
    }

    protected void metodoProtegido() {
        System.out.println("Metodo protegido");
    }

}
