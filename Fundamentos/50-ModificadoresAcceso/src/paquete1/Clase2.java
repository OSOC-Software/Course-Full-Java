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
public class Clase2 {
    // private class Clase2 ; private no esta a nivel de clases

    private Clase2() {
        System.out.println("Constructor Privado");
    }

    public Clase2(String c) {
        this();
        System.out.println("Constructor Privado con arg " + c);
    }

    private void metodoPRivado() {
        System.out.println("Metodo Privado");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('}');
        return sb.toString();
    }

}
