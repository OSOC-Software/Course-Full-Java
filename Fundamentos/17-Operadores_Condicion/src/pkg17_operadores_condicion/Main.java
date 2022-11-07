/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17_operadores_condicion;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        var a = 10;
        var vMin = 0;
        var vMax = 10;

        var res = a >= vMin && a <= vMax;
        System.out.println("res = " + res);
        
        if(res)
            System.out.println("Esta en el rango");
        else
            System.out.println("Fuera de rango");

    }

}
