/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Persona;

/**
 *
 * @author ASUS
 */
public class TestMatrices {

    public static void main(String[] args) {

        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);

        edades[0][0] = 1;
        edades[0][1] = 2;
        edades[1][0] = 3;
        edades[1][1] = 4;

        System.out.println("edades 0-0: " + edades[0][0]);

        for (var ren = 0; ren < edades.length; ren++) {
            for (var col = 0; col < edades[ren].length; col++) {
                System.out.println("edades " + ren + "-" + col + ": " + edades[ren][col]);
            }
        }

        String frutas[][] = {{"Naranja", "Limon"}, {"Fresa", "Mora"}};
        imprimir(frutas);

        Persona personas[][] = new Persona[2][3];

        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Diego");
        imprimir(personas);

    }

    public static void imprimir(Object matriz[][]) {
        for (var ren = 0; ren < matriz.length; ren++) {
            for (var col = 0; col < matriz[ren].length; col++) {
                System.out.println("Matriz " + ren + "-" + col + ": " + matriz[ren][col]);
            }
        }

    }
}
