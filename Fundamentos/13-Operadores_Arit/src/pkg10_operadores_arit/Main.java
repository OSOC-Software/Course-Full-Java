/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_operadores_arit;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 3, b = 2;
        var resultado = a + b;
        System.out.println("resultado suma= " + resultado);
        resultado = a - b;
        System.out.println("resultado resta= " + resultado);
        resultado = a * b;
        System.out.println("resultado multi= " + resultado);
        resultado = a / b;
        System.out.println("resultado div / int= " + resultado);
        var resultado2 = 2.1 / b;
        System.out.println("resultado2 div / float= " + resultado2);

        resultado = a % b;
        System.out.println("resultado mod % = " + resultado);
        if(a % 2 == 0)
            System.out.println("a Es par");
        else 
            System.out.println("a Es impar");

    }

}
