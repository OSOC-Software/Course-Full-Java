/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg23.pkgdo.pkgwhile;

/**
 *
 * @author ASUS
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        var contador = 0;

        do {
            System.out.println("contador = " + contador);
            contador++;
        } while (contador <= 3);

    }

}
