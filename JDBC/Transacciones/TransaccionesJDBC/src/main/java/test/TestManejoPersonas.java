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
        Connection con = null;
        try {
            con = Conexion.getConnection();
            if (con.getAutoCommit()) {
                con.setAutoCommit(false);
            }
            PersonaDAO per = new PersonaDAO(con);

            Persona cambioPer = new Persona();
            cambioPer.setIdPersona(1);
            cambioPer.setApellido("juajuajua");
            cambioPer.setEmail("juajuajua@jotmail");
            cambioPer.setTelefono("9999999999999");
            per.putPersona(cambioPer);
            Persona newPersona = new Persona();
            newPersona.setNombre("jasjdasda");
            newPersona.setApellido("sasadd");
            newPersona.setEmail("asdasdas@hotmailc");

            per.postPersona(newPersona);
            con.commit();
        } catch (SQLException ex) {
            try {
                System.out.println("Error SQL : Rollback");
                ex.printStackTrace(System.out);
                con.rollback();
            } catch (SQLException ex1) {
                ex.printStackTrace(System.out);
            }
            //PersonaDAO perDao = new PersonaDAO();
            //Persona perDelete = new Persona(2);
            //perDao.deletePersona(perDelete);
            //Persona perUpdate = new Persona(7,"Peter Update", "Parker", "pp@mail.com", "2123123");
            //perDao.putPersona(perUpdate);
            //Persona per1 = new Persona("Peter", "Parker", "pp@mail.com", "2123123");
            //perDao.postPersona(per1);
            //List<Persona> personas = perDao.getPersonas();
            //personas.forEach(per -> {
            //    System.out.println("Perona: " + per);
            //});
//        for (Persona per : personas) {
//            System.out.println("Perona: " + per);
//        }

        }
    }
}
