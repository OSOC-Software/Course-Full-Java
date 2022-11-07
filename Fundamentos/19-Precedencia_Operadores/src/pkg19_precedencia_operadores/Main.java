/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19_precedencia_operadores;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Prioridad de Operadores
        /*        
        1. Op. Unarios: ++ , -- , +, -, ~, ! 
        2. Parentesis: con cualquier expresion dentro
        3. Op. Aritmeticos: *, /, % 
        4. Op. Aritmeticos: +, -, concatenacion de cadenas (+)
        5. Op. Integrales: >>, <<, >>>> 
        6. Op. Aritmeticos de comparacion: <, <=, >, >=, intanceof
        7. Op. Primitivos y Objeto: ==, != 
        8. Op. Integral y Bolleano: &(Cambio de bits AND), &(Producto Booleano)
        9. Op. Integral y Booleano: ^(Cambio de bits XOR), ^(Suma exclusiva Booleana)
       10. Op. Integral y Booleano: |(Cambio de bits OR), |(Suma Booleana)
       11. Op. Booleano: && (AND condicional)
       12. Op. Condicional: || (OR Condicional)
       13. Op ternario: ? : 
       14. Variable, Cualquiera: =. *=, /=, %=, +=, -=, <<=, >>=, >>>>=, &=, ^=, != 
                                    (Asignacion, Asignacion con operacion)
         */

        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        var resultado = 4 + 5 * 6 / 3;
        System.out.println("resultado = " + resultado);

        resultado = (4 + 5) * 6 / 3;
        System.out.println("resultado = " + resultado);
    }

}
