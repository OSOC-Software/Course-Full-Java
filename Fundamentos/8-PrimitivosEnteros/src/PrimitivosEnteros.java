/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class PrimitivosEnteros {

    public static void main(String[] args) {
        /*
        Tipos primitivos enteros:
        # Nombre Tamaño Default Rango
        1. byte 8 bits 0 -128; 127
        2. short 16 bits 0 -32.768; 32.767
        3. char 16 bits \u0000 0; 65.535
        4. int 32 bits 0 -2^31; -2^31-1
        5. long 64 bits 0 -2^63; 2^63-1
        6. float 32 bits 0.0 1.4e-045; 3.4e+038
        7. double 64 bits 0.0 4.9e-324; 1.8e+308
         */

        byte nbyte = 12;
        System.out.println("nbyte = " + nbyte);
        System.out.println("V.Min Byte: " + Byte.MIN_VALUE);
        System.out.println("V.MAX Byte: " + Byte.MAX_VALUE);

        short nShort = 34;
        System.out.println("nShort = " + nShort);
        System.out.println("V.Min Byte: " + Short.MIN_VALUE);
        System.out.println("V.MAX Byte: " + Short.MAX_VALUE);

        int nInt = 34;
        System.out.println("nInt = " + nInt);
        System.out.println("V.Min Byte: " + Integer.MIN_VALUE);
        System.out.println("V.MAX Byte: " + Integer.MAX_VALUE);

        long nLong = 1231231312;
        System.out.println("nLong = " + nLong);
        System.out.println("V.Min Byte: " + Long.MIN_VALUE);
        System.out.println("V.MAX Byte: " + Long.MAX_VALUE);

    }
}
