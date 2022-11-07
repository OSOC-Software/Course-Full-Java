/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.*;
import java.sql.*;
import domain.*;

/**
 *
 * @author ASUS
 */
public class PersonaDAOJDBC implements IPersonaDAO {

    private Connection conexionTransaccional;
    private static final String SQL_SELECT = "SELECT * FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE id_persona = ?;";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?;";

    public PersonaDAOJDBC() {
    }

    public PersonaDAOJDBC(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    public List<PersonaDTO> select() throws SQLException {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        PersonaDTO persona = null;
        List<PersonaDTO> personas = new ArrayList<>();

        try {
            con = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            st = con.prepareStatement(SQL_SELECT);
            rs = st.executeQuery();
            while (rs.next()) {
                int idPersona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                persona = new PersonaDTO(idPersona, nombre, apellido, email, telefono);
                personas.add(persona);
            }
        } finally {

            try {
                Conexion.close(rs);
                Conexion.close(st);
                if (this.conexionTransaccional == null) {
                    Conexion.close(con);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return personas;
    }

    public int insert(PersonaDTO persona) throws SQLException {
        Connection con = null;
        PreparedStatement st = null;
        int registros = 0;
        try {
            con = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            st = con.prepareStatement(SQL_INSERT);
            st.setString(1, persona.getNombre());
            st.setString(2, persona.getApellido());
            st.setString(3, persona.getEmail());
            st.setString(4, persona.getTelefono());
            registros = st.executeUpdate();
        } finally {
            try {
                Conexion.close(st);
                if (this.conexionTransaccional == null) {
                    Conexion.close(con);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int update(PersonaDTO persona) throws SQLException {
        Connection con = null;
        PreparedStatement st = null;
        int registros = 0;
        try {
            con = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            st = con.prepareStatement(SQL_UPDATE);
            st.setString(1, persona.getNombre());
            st.setString(2, persona.getApellido());
            st.setString(3, persona.getEmail());
            st.setString(4, persona.getTelefono());
            st.setInt(5, persona.getIdPersona());
            registros = st.executeUpdate();
        } finally {
            try {
                Conexion.close(st);
                if (this.conexionTransaccional == null) {
                    Conexion.close(con);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int delete(PersonaDTO persona) throws SQLException {
        Connection con = null;
        PreparedStatement st = null;
        int registros = 0;
        try {
            con = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            st = con.prepareStatement(SQL_DELETE);
            st.setInt(1, persona.getIdPersona());
            registros = st.executeUpdate();
        } finally {
            try {
                Conexion.close(st);
                if (this.conexionTransaccional == null) {
                    Conexion.close(con);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

}
