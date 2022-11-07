/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import datos.PersonaDAO;
import java.util.List;
import domain.Persona;

/**
 *
 * @author ASUS
 */
public class TestManejoPersonas {

    public static void main(String[] args) {
        PersonaDAO perDao = new PersonaDAO();

        Persona perDelete = new Persona(2);
        perDao.deletePersona(perDelete);

        //Persona perUpdate = new Persona(7,"Peter Update", "Parker", "pp@mail.com", "2123123");
        //perDao.putPersona(perUpdate);
        //Persona per1 = new Persona("Peter", "Parker", "pp@mail.com", "2123123");
        //perDao.postPersona(per1);
        List<Persona> personas = perDao.getPersonas();
        personas.forEach(per -> {
            System.out.println("Perona: " + per);
        });
//        for (Persona per : personas) {
//            System.out.println("Perona: " + per);
//        }
    }
}
