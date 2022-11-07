/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.jd.sga.servicio;

import co.com.jd.sga.domain.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author ASUS
 */
@Stateless
public class PersonaServicioImpl implements PersonaServiceRemote {

    @Override
    public List<Persona> list() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1, "Juan", "Osorio", "juan@juan.com", "320"));
        personas.add(new Persona(2, "Cosme", "Osorio", "cosme@juan.com", "3201"));
        personas.add(new Persona(3, "Timmy", "Osorio", "timmy@juan.com", "3202"));
        personas.add(new Persona(4, "Luna", "Osorio", "luna@juan.com", "3203"));
        return personas;
    }

    @Override
    public Persona encontrarPersonaId(Persona per) {
        return null;
    }

    @Override
    public Persona encontrarPersonaEmail(Persona per) {
        return null;

    }

    @Override
    public void registrarPersona(Persona per) {
    }

    @Override
    public void modificarPersona(Persona per) {
    }

    @Override
    public void eliminarPersona(Persona per) {
    }

}
