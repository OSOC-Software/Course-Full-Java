/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import datos.PersonaDAO;
import java.util.*;
import domain.*;

/**
 *
 * @author ASUS
 */
public class TestManejoPersonas {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();

        //Insertar 
        Persona per = new Persona(4, "Diego 2", "Vikingo 2", "dv2@hotmail.com", "3104175259");
        personaDao.actualizar(per);
        //Actualizar
        Persona per1 = new Persona("Juan Diego", "Vikingo", "dv@hotmail.com", "3104175259");
        personaDao.insertar(per1);
        
        //Eliminar
        Persona pE = new Persona(4);
        personaDao.eliminar(pE);

        //Listar 
        List<Persona> personas = personaDao.seleccionar();
        personas.forEach(persona -> {
            System.out.println(persona);
        });

    }

}
