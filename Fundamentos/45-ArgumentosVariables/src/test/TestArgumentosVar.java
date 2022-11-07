/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author ASUS
 */
public class TestArgumentosVar {

    public static void main(String[] args) {
        imprimirNumeros(2, 3, 4, 5, 6);
        imprimirNumeros(1);
        imprimirNumeros(10, 12, 2, 2, 2, 2, 2);

        variosParametros("Juan", 102, 1332, 256, 2632, 542, 232, 232);

    }

    private static void variosParametros(String nombre, int... numeros) {
        System.out.println("Nombre: " + nombre);
        imprimirNumeros(numeros);
    }

    private static void imprimirNumeros(int... numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento : " + numeros[i]);
        }
    }
}
