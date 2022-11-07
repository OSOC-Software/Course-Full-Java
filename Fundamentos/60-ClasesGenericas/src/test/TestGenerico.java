/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import genericos.ClaseGenerica;

/**
 *
 * @author ASUS
 */
public class TestGenerico {

    public static void main(String[] args) {

        ClaseGenerica<Integer> objInt = new ClaseGenerica(19);
        objInt.obtenerTipo();

        ClaseGenerica<String> objString = new ClaseGenerica("Juan");
        objString.obtenerTipo();
        
    }
}
