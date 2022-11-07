/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import beans.HolaMundoEJBRemote;
import javax.naming.*;

/**
 *
 * @author ASUS
 */
public class TestHolaMundoEJB {

    public static void main(String[] args) {
        System.out.println("Iniciando llamado EJB desde cliente");
        try {
            Context jndi = new InitialContext();
            HolaMundoEJBRemote holamundoEjb = (HolaMundoEJBRemote) jndi.lookup("java:global/86-HolaMundoEJB-1.0/HolaMundoEJBImpl");
            int res = holamundoEjb.sumar(21, 3);
            System.out.println("Resultado suma EJB: " + res);
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
        }
    }

}
