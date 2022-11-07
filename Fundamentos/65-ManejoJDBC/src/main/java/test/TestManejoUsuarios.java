/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class TestManejoUsuarios {

    public static void main(String[] args) {

        UsuarioDAO usDao = new UsuarioDAO();

        //Insertar
        //Usuario us1 = new Usuario("Diego Osorio", "admin123");
        //usDao.insertar(us1);
        //Actualizar
        Usuario us2 = new Usuario(1);
        us2.setUsuario("Diego Update");
        us2.setPassword("pass Update");
        usDao.actualizar(us2);

        //Listar 
        List<Usuario> usuarios = usDao.seleccionar();
        usuarios.forEach(us_ -> {
            System.out.println(us_);
        });
    }
}
