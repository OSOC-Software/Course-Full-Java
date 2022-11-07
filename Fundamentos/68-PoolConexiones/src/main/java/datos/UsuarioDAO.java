/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import domain.*;
import java.sql.*;
import java.util.*;

/**
 *
 * @author ASUS
 */
public class UsuarioDAO {

    private static final String SQL_SELECT = "SELECT * FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario(usuario, password) VALUES(?,?);";
    private static final String SQL_UPDATE = "UPDATE usuario SET usuario=?, password=? WHERE id_usuario = ?;";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?;";
    private Connection conexion;

    public UsuarioDAO() {
    }

    public UsuarioDAO(Connection conexion) {
        this.conexion = conexion;
    }

    public List<Usuario> seleccionar() throws SQLException {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        Usuario usuarioObj = null;
        List<Usuario> usuarios = new ArrayList<>();
        try {
            con = this.conexion != null ? this.conexion : Conexion.getConnection();
            st = con.prepareStatement(SQL_SELECT);
            rs = st.executeQuery();
            while (rs.next()) {
                int idPersona = rs.getInt("id_usuario");
                String nombreUsuario = rs.getString("usuario");
                String password = rs.getString("password");
                usuarioObj = new Usuario(idPersona, nombreUsuario, password);
                usuarios.add(usuarioObj);
            }
        } finally {
            try {
                if (this.conexion == null) {
                    Conexion.close(con);
                }
                Conexion.close(rs);
                Conexion.close(st);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return usuarios;
    }

    public int insertar(Usuario us) throws SQLException {
        int registros = 0;
        Connection con = null;
        PreparedStatement st = null;
        try {
            con = this.conexion != null ? this.conexion : Conexion.getConnection();
            st = con.prepareStatement(SQL_INSERT);
            st.setString(1, us.getUsuario());
            st.setString(2, us.getPassword());
            registros = st.executeUpdate();
        } finally {
            try {
                Conexion.close(st);
                if (this.conexion == null) {
                    Conexion.close(con);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return registros;
    }

    public int actualizar(Usuario us) throws SQLException {
        int registros = 0;
        Connection con = null;
        PreparedStatement st = null;
        try {
            con = this.conexion != null ? this.conexion : Conexion.getConnection();
            st = con.prepareStatement(SQL_UPDATE);
            st.setString(1, us.getUsuario());
            st.setString(2, us.getPassword());
            st.setInt(3, us.getId_usuario());

            registros = st.executeUpdate();
        } finally {
            try {
                Conexion.close(st);
                if (this.conexion == null) {
                    Conexion.close(con);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int eliminar(Usuario us) throws SQLException {
        Connection con = null;
        PreparedStatement st = null;
        int registros = 0;
        try {
            con = this.conexion != null ? this.conexion : Conexion.getConnection();
            st = con.prepareStatement(SQL_DELETE);
            st.setInt(1, us.getId_usuario());
            registros = st.executeUpdate();
        } finally {
            try {
                Conexion.close(st);
                if (this.conexion == null) {
                    Conexion.close(con);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;

    }
}
