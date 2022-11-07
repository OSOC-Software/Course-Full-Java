/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoporvalor;

/**
 *
 * @author ASUS
 */
public class PasoPorValor {

    public static void main(String[] args) {
        // Con tipos primitivos
        int x = 10;
        System.out.println("x = " + x);
        cambioDeValor(x);
        System.out.println("x con cambio de valor = " + x);
    }

    public static void cambioDeValor(int arg1) {
        System.out.println("arg1 = " + arg1);
        arg1 = 12;
    }

}
