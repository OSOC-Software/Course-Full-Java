/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Concatenacion {

    public static void main(String[] args) {
        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var i = 2;
        var j = 34;

        System.out.println(i + j); //Imprime la suma 
        System.out.println(i + j + usuario); // De izq a derecha: Realiza la suma y luego agrega la cadena
        System.out.println(usuario + i + j);// Contexto cadena, al encontrar una cadena de primero supone que el resto lo es
        System.out.println(usuario + (i + j));// cambiando las prioridades y omitiendo Contexto cadena

    }

}
