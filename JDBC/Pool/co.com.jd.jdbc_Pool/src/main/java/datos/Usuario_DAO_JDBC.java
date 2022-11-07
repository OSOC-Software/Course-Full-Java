/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import domain.UsuarioDTO;
import java.sql.*;
import java.util.*;

/**
 *
 * @author ASUS
 */
public class Usuario_DAO_JDBC implements UsuarioDAO{

    private static final String SQL_SELECT = "SELECT id_usuario, username, password FROM usuario;";
    private static final String SQL_INSERT = "INSERT INTO usuario(username, password) VALUES (?,?);";
    private static final String SQL_UPDATE = "UPDATE usuario SET username = ?, password= ? WHERE id_usuario = ?;";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?;";

    public List<UsuarioDTO> select() {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        UsuarioDTO per = null;
        List<UsuarioDTO> usuarios = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            pstm = conn.prepareStatement(SQL_SELECT);
            rs = pstm.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id_usuario");
                String username = rs.getString("username");
                String password = rs.getString("password");
                per = new UsuarioDTO(id, username, password);
                usuarios.add(per);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(pstm);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return usuarios;
    }

    public int insert(UsuarioDTO per) {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            pstm = conn.prepareStatement(SQL_INSERT);
            pstm.setString(1, per.getUsername());
            pstm.setString(2, per.getPassword());
            registros = pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(pstm);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return registros;
    }

    public int update(UsuarioDTO per) {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            pstm = conn.prepareStatement(SQL_UPDATE);
            pstm.setString(1, per.getUsername());
            pstm.setString(2, per.getPassword());
            pstm.setInt(3, per.getId_usuario());
            registros = pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(pstm);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int delete(UsuarioDTO per) {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        int registros = 0;
        try {
            conn = Conexion.getConnection();
            pstm = conn.prepareStatement(SQL_DELETE);
            pstm.setInt(1, per.getId_usuario());
            registros = pstm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(pstm);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

}
