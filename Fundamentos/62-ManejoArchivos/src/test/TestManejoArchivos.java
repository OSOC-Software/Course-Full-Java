/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import manejoarchivos.ManejoArchivos;

/**
 *
 * @author ASUS
 */
public class TestManejoArchivos {

    public static void main(String[] args) {

        var archivo = "Prueba.txt";

        //ManejoArchivos.crearArchivo(archivo);
        ManejoArchivos.anexarArchivo(archivo, "Prueba 2 de escritura desde Java");
        
        

    }

}
