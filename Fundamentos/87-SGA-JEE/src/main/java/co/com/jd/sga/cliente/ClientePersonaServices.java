/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.jd.sga.cliente;

import co.com.jd.sga.domain.Persona;
import co.com.jd.sga.servicio.PersonaServiceRemote;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.*;

/**
 *
 * @author ASUS
 */
public class ClientePersonaServices {

    public static void main(String[] args) {
        System.out.println("Iniciando Llamada al EJB desde el cliente");

        try {
            Context jndi = new InitialContext();
            //java:global/87-SGA-JEE-1.0/PersonaServicioImpl
            PersonaServiceRemote perService = (PersonaServiceRemote) jndi.lookup("java:global/87-SGA-JEE-1.0/PersonaServicioImpl");
            List<Persona> personas = perService.list();
            for (Persona per : personas) {
                System.out.println(per);
            }
            System.out.println("Fin EJB");
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
        }

    }

}
