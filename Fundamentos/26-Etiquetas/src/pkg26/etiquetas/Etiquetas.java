/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg26.etiquetas;

/**
 *
 * @author ASUS
 */
public class Etiquetas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Continue: ------------------");
        //CONTINUE;
        //Etiqueta inicio donde se saltara el bucle 
        inicio:
        for (var contador = 0; contador < 3; contador++) {
            if (contador % 2 != 0) {
                continue inicio;
            }
            System.out.println("contador = " + contador);
        }

    }

}
