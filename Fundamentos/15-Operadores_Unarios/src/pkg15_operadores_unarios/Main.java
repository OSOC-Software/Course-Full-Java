/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15_operadores_unarios;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Cambio de signo
        int a = 8;
        int b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Negacion
        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        //  Incremento
        // -- Pre incremento
        var e = 3;
        var f = ++e;
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        // -- Pre incremento
        var g = 5;
        var h = g++;
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        //Decremento
        // -- Pre decremento
        var i = 3;
        var j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        //-- Post Decremento 
        var k = 3;
        var l = k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);

    }

}
