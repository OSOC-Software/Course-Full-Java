/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20_if_else;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        var condicion = true;

        if (condicion == true) {
            System.out.println("Es verdadera");
        } else {
            System.out.println("Es falsa");
        }

        //Ejemplo 
        var numero = 2;
        var numeroTexto = "Num desconocido";

        if (numero == 1) {
            numeroTexto = "Uno";
        } else if (numero == 2) {
            numeroTexto = "Dos";
        } else if (numero == 3) {
            numeroTexto = "Tres";
        } else if (numero == 4) {
            numeroTexto = "Cuatro";
        } else {
            numeroTexto = "Sin numero";
        }

        System.out.println("numeroTexto = " + numeroTexto);

    }

}
