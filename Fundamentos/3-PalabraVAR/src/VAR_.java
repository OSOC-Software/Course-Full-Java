/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class VAR_ {

    public static void main(String[] args) {

        // Palabra reservada VAR - Inferencia de tipo
        int miVariable = 10; // Tipo entero
        var miVariable2 = 10;// Tipo entero
        System.out.println(miVariable);
        System.out.println(miVariable2);

        String nombre = "Juan"; //Tipo cadena
        var nombre2 = "Juan";//Tipo cadena
        System.out.println(nombre);
        System.out.println(nombre2);

        var entero = 10; //Tipo int
        var nDouble = 10.0; // Tipo double
        var nFloat = 2342.234F; //Tipo float
    }
}
