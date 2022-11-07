/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.jd.sga.datos;

import co.com.jd.sga.domain.Persona;
import java.util.List;

/**
 *
 * @author ASUS
 */
public interface PersonaDAO {

    public List<Persona> findAllPersonas();

    public Persona findPersonaById(Persona per);

    public Persona findPersonaByEmail(Persona per);

    public void insertPersona(Persona per);

    public void updatePersona(Persona per);

    public void deletePersona(Persona per);

}
