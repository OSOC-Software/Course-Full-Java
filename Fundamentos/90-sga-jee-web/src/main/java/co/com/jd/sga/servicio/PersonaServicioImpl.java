/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.jd.sga.servicio;

import co.com.jd.sga.datos.PersonaDAO;
import co.com.jd.sga.domain.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author ASUS
 */
@Stateless
public class PersonaServicioImpl implements PersonaServiceRemote, PersonaService {

    @Inject
    private PersonaDAO perDao;

    @Override
    public List<Persona> list() {
        return perDao.findAllPersonas();
    }

    @Override
    public Persona encontrarPersonaId(Persona per) {
        return perDao.findPersonaById(per);
    }

    @Override
    public Persona encontrarPersonaEmail(Persona per) {
        return perDao.findPersonaByEmail(per);
    }

    @Override
    public void registrarPersona(Persona per) {
        perDao.insertPersona(per);
    }

    @Override
    public void modificarPersona(Persona per) {
        perDao.updatePersona(per);
    }

    @Override
    public void eliminarPersona(Persona per) {
        perDao.deletePersona(per);
    }

}
