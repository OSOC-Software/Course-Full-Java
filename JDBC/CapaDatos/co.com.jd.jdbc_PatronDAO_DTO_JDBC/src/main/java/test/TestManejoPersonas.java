/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import datos.*;
import domain.*;
import java.sql.*;
import java.util.List;

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
            PersonaDAO personaDao = new Persona_DAO_JDBC(con);
            
            List<PersonaDTO> personas = personaDao.select();
            for (PersonaDTO persona: personas){
                System.out.println("Persona DTO: " + persona);
            }

//            PersonaDTO cambioPer = new PersonaDTO();
//            cambioPer.setIdPersona(1);
//            cambioPer.setApellido("juajuajua");
//            cambioPer.setEmail("juajuajua@jotmail");
//            cambioPer.setTelefono("9999999999999");
//            per.update(cambioPer);
//            PersonaDTO newPersona = new PersonaDTO();
//            newPersona.setNombre("jasjdasda");
//            newPersona.setApellido("sasadd");
//            newPersona.setEmail("asdasdas@hotmailc");
//
//            per.insert(newPersona);
//            con.commit();
        } catch (SQLException ex) {
            try {
                System.out.println("Error SQL : Rollback");
                ex.printStackTrace(System.out);
                con.rollback();
            } catch (SQLException ex1) {
                ex.printStackTrace(System.out);
            }
            //PersonaDAO perDao = new Persona_DAO_JDBC();
            //Persona perDelete = new PersonaDTO(2);
            //perDao.deletePersona(perDelete);
            //Persona perUpdate = new PersonaDTO(7,"Peter Update", "Parker", "pp@mail.com", "2123123");
            //perDao.putPersona(perUpdate);
            //Persona per1 = new PersonaDTO("Peter", "Parker", "pp@mail.com", "2123123");
            //perDao.postPersona(per1);
            //List<Persona> personas = perDao.getPersonas();
            //personas.forEach(per -> {
            //    System.out.println("Perona: " + per);
            //});
//        for (PersonaDTO per : personas) {
//            System.out.println("Perona: " + per);
//        }

        }
    }
}
