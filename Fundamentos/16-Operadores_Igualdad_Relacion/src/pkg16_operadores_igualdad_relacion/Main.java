/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16_operadores_igualdad_relacion;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        var a = 3;
        var b = 5;
        var c = a == b;
        System.out.println("c = " + c);
        var d = a != b;
        System.out.println("d = " + d);

        var cad1 = "Hola";
        var cad2 = "Hola";

        var e = cad1 == cad2; // Comparacion por referencia. String es obj
        System.out.println("e = " + e);

        var f = cad1.equals(cad2);
        System.out.println("f = " + f);

        var g = a >= b;
        System.out.println("g = " + g);
        
        if(a % 2 == 0)
            System.out.println("a Es par");
        else
            System.out.println("a Es impar");

    }

}
