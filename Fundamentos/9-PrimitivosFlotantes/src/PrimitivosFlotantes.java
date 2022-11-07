/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class PrimitivosFlotantes {

    public static void main(String[] args) {

        /*
        Tipos primitivos flotante:
        # Nombre Tamaño Default Rango
        1. float 32 bits 0.0 1.4e-045; 3.4e+038
        2. double 64 bits 0.0 4.9e-324; 1.8e+308
         */
        float nFloat = 10123123.12312312312F;
        System.out.println("nFloat = " + nFloat);
        System.out.println("V.Min Byte: " + Float.MIN_VALUE);
        System.out.println("V.MAX Byte: " + Float.MAX_VALUE);

        double nDouble = 123123121.2312312312;
        System.out.println("nDouble = " + nDouble);
        System.out.println("V.Min Byte: " + Double.MIN_VALUE);
        System.out.println("V.MAX Byte: " + Double.MAX_VALUE);

    }
}
