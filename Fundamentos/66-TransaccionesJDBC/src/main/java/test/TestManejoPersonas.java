/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import datos.*;
import java.util.*;
import domain.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class TestManejoPersonas {

    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            PersonaDAO perDao = new PersonaDAO(conexion);
            Persona cambioPersona = new Persona();
            cambioPersona.setIdPersona(1);
            cambioPersona.setNombre("Prueba Cambio");
            cambioPersona.setApellido("Odasdas");
            cambioPersona.setEmail("jaun@juann.com");
            cambioPersona.setTelefono("234235235");
            perDao.actualizar(cambioPersona);

            Persona nuevaPer = new Persona();
            nuevaPer.setNombre("Prueba Carlangas");
            nuevaPer.setApellido("Serna");
            perDao.insertar(nuevaPer);

            conexion.commit();
            System.out.println("Se ha hecho commit de la transaccion");
        } catch (SQLException ex) {
            try {
                ex.printStackTrace(System.out);
                System.out.println("Entra al rollback");
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }

    }

}
