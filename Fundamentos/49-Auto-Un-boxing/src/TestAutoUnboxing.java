/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class TestAutoUnboxing {

    public static void main(String[] args) {

        //Cada tipo primitivo esta asociado o envuelto en una clase Wrapper o Envolvente
        /*Clases envolventes de tipos primitivos
         int - Integer
         long - Long
         float - Float
         double - Double
         boolean - Boolean
         byte - Byte
         char - Character
         short - Short
         */
        int entero = 10;
        System.out.println("entero = " + entero);
        Integer enteroClass = 10;
        System.out.println("enteroClass = " + enteroClass);
        int enteroAutoboxing = enteroClass;
        System.out.println("enteroAutoboxing = " + enteroAutoboxing);
    }

}
