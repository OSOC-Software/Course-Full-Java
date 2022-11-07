/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        try {
            usDao.actualizar(us2);
        } catch (SQLException ex) {
            Logger.getLogger(TestManejoUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Listar 
        List<Usuario> usuarios;
        try {
            usuarios = usDao.seleccionar();
            usuarios.forEach(us_ -> {
                System.out.println(us_);
            });
        } catch (SQLException ex) {
            Logger.getLogger(TestManejoUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
