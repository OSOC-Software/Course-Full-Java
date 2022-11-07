/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import accesodatos.IAccesoDatos;
import accesodatos.*;

/**
 *
 * @author ASUS
 */
public class TestInterfaces {

    public static void main(String[] args) {
        IAccesoDatos datosMySQL = new ImplementacionMySQL();
        imprimir(datosMySQL);
        IAccesoDatos datosOracle = new ImplementacionOracle();
        imprimir(datosOracle);

    }

    public static void imprimir(IAccesoDatos datos) {
        datos.listar();
    }

}
