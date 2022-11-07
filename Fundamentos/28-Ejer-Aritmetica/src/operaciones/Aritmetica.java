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
public class Aritmetica {

    int a;
    int b;

    public Aritmetica() {
        System.out.println("Ejecutando constructor");
    }

    public Aritmetica(int a, int b) {
        System.out.println("Ejecutando constructor args");
        this.a = a;
        this.b = b;
    }

    public void suma() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarRetorno() {
        return a + b;
    }

    public int sumerArgumentos(int a, int b) {
        this.a = a;
        this.b = b;
        return this.sumarRetorno();
    }

}
