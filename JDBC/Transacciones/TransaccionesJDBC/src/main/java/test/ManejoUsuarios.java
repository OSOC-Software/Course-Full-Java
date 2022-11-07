/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import datos.UsuarioDAO;
import domain.*;
import java.util.*;

/**
 *
 * @author ASUS
 */
public class ManejoUsuarios {

    public static void main(String[] args) {
        UsuarioDAO user1 = new UsuarioDAO();
        List<Usuario> users = user1.getUsuarios();

        users.forEach(user -> {
            System.out.println("User: " + user);
        });

        //Usuario u1 = new Usuario("Juan Diego Osorio Castrillon", "123456");
        //user1.postUsuario(u1);
        
        
        //Usuario u1 = new Usuario(1);
        //user1.putUsuario(u1);
        
        //user1.deleteUsuario(u1);
        
    }
}
