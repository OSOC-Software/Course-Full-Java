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
public class TestArreglos {

    public static void main(String[] args) {

        //int edades[]; Correcto 
        int[] edades = new int[3]; //Correcto
        System.out.println("edades = " + edades);

        edades[0] = 17;
        System.out.println("edades 0 = " + edades[0]);

        //edades[3] = 27;
        //System.out.println("edades 3 = " + edades[0]); //Error en tiempo de ejecucion, indice fuera de rango

        for (int i = 0; i < edades.length; i++) {
            System.out.println(edades[i]);
        }
    }

}
