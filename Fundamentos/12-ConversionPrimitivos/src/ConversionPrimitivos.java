
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class ConversionPrimitivos {

    public static void main(String[] args) {
        //String a Entero/Double
        var edad1 = Integer.parseInt("20");
        var edad2 = Double.parseDouble("20");
        System.out.println("edad = " + (edad1 + 1));
        System.out.println("edad = " + (edad2 + 1));

        var consola = new Scanner(System.in);
        System.out.println("Ingresar edad");
        edad1 = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad1);
        
        //Convertir Int a String
        var edadTexto = String.valueOf(123);
        System.out.println("edadTexto = " + edadTexto);
        
        
        //String a Char
        var caracter = "hola".charAt(0);
        System.out.println("caracter = " + caracter);
        
        System.out.println("Ingrese caracter");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        
    }

}
