/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import co.com.jd.sga.domain.Persona;
import javax.persistence.*;
import org.apache.logging.log4j.*;

/**
 *
 * @author ASUS
 */
public class ClienteEntidadPersona {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        //Se inicia transaccion
        tx.begin();
        //No especificar id
        Persona per = new Persona("Juan Diego ", "Osorio C", "juan@juan.com", "121212121212");
        log.debug("Objeto a persistir: " + per);
        em.persist(per);
        tx.commit(); 
        log.debug("Objeto Persistido");
        em.close();
        emf.close();
    }
}
