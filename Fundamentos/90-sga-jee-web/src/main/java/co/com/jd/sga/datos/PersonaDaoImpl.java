/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.jd.sga.datos;

import co.com.jd.sga.domain.Persona;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author ASUS
 */
public class PersonaDaoImpl implements PersonaDAO {

    @PersistenceContext(unitName = "PersonaPU")
    EntityManager em;

    @Override
    public List<Persona> findAllPersonas() {
        return em.createNamedQuery("Persona.findAll").getResultList();
    }

    @Override
    public Persona findPersonaById(Persona per) {
        return em.find(Persona.class, per.getIdPersona());
    }

    @Override
    public Persona findPersonaByEmail(Persona per) {
        Query query = em.createQuery("FROM Persona p WHERE p.email =: email");
        query.setParameter("email", per.getEmail());
        return (Persona) query.getSingleResult();
    }

    @Override
    public void insertPersona(Persona per) {
        em.persist(per);
    }

    @Override
    public void updatePersona(Persona per) {
        em.merge(per);
    }

    @Override
    public void deletePersona(Persona per) {
        em.remove(em.merge(per));
    }

}
