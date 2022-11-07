/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.jd.sga.servicio;

import co.com.jd.sga.domain.Persona;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface PersonaServiceRemote {

    public List<Persona> list();

    public Persona encontrarPersonaId(Persona per);

    public Persona encontrarPersonaEmail(Persona per);

    public void registrarPersona(Persona per);

    public void modificarPersona(Persona per);

    public void eliminarPersona(Persona per);

}
