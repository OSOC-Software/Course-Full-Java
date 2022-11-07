/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operador_ternario;

/**
 *
 * @author ASUS
 */
public class Operador_Ternario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var resultado = (0 > 2) ? "Verdadero" : false;
        System.out.println("resultado = " + resultado);

        var numero = 8;
        resultado = (numero % 2 == 0) ? "Es par" : "Es impar";
        System.out.println("resultado = " + resultado);
    }

}
