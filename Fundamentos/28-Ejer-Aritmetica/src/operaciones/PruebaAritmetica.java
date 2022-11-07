/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author ASUS
 */
public class PruebaAritmetica {

    public static void main(String[] args) {
        Aritmetica a1 = new Aritmetica();
        a1.a = 12;
        a1.b = 5;
        a1.suma();

        int res = a1.sumarRetorno();
        System.out.println("res = " + res);
        System.out.println("res2 = " + a1.sumerArgumentos(34, 53));

        Aritmetica a2 = new Aritmetica(1, 4);
        System.out.println("Aritmetica 2 a: " + a2.a);
        System.out.println("Aritmetica 2 b: " + a2.b);

        int a = 10;
        int b = 2;

    }

    public static void myMethod() {
        //VAriable fuera del alcance 
        //a = 10
        System.out.println("Otro metodo");
    }

}
