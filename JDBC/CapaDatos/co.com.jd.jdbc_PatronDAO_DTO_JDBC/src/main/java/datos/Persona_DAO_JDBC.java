/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.*;
import domain.PersonaDTO;
import java.sql.*;

/**
 *
 * @author ASUS
 */
public class Persona_DAO_JDBC implements PersonaDAO{

    private Connection conexionTransaccional;

    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM persona;";
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono ) VALUES (?,?,?,?);";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre = ?, apellido = ?, email = ?, telefono = ? WHERE id_persona = ?;";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?;";

    public Persona_DAO_JDBC() {
    }

    public Persona_DAO_JDBC(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    public List<PersonaDTO> select() throws SQLException {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        PersonaDTO per = null;
        List<PersonaDTO> personas = new ArrayList<>();

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            pstm = conn.prepareStatement(SQL_SELECT);
            rs = pstm.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                per = new PersonaDTO(id, nombre, apellido, email, telefono);
                personas.add(per);
            }
        } //        catch (SQLException ex) { //        catch (SQLException ex) {
        //            ex.printStackTrace(System.out);
        //        }
        finally {
            try {
                Conexion.close(rs);
                Conexion.close(pstm);
                if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return personas;
    }

    public int insert(PersonaDTO per) throws SQLException {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            pstm = conn.prepareStatement(SQL_INSERT);
            pstm.setString(1, per.getNombre());
            pstm.setString(2, per.getApellido());
            pstm.setString(3, per.getEmail());
            pstm.setString(4, per.getTelefono());
            registros = pstm.executeUpdate();
            registros = pstm.executeUpdate();

        } //        catch (SQLException ex) {
        //            ex.printStackTrace(System.out);
        //        } 
        finally {
            try {
                Conexion.close(pstm);
                if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return registros;
    }

    public int update(PersonaDTO per) throws SQLException {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            pstm = conn.prepareStatement(SQL_UPDATE);
            pstm.setString(1, per.getNombre());
            pstm.setString(2, per.getApellido());
            pstm.setString(3, per.getEmail());
            pstm.setString(4, per.getTelefono());
            pstm.setInt(5, per.getIdPersona());
            registros = pstm.executeUpdate();
        } //        catch (SQLException ex) {
        //            ex.printStackTrace(System.out);
        //        }
        finally {
            try {
                Conexion.close(pstm);
                if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public int delete(PersonaDTO per) throws SQLException {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        int registros = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            pstm = conn.prepareStatement(SQL_DELETE);
            pstm.setInt(1, per.getIdPersona());
            registros = pstm.executeUpdate();
        } //        catch (SQLException ex) {
        //            ex.printStackTrace(System.out);
        //        } 
        finally {
            try {
                Conexion.close(pstm);
                if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

}
