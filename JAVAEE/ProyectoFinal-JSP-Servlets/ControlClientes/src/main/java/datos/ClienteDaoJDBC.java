/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import dominio.Cliente;
import java.util.*;
import java.sql.*;

/**
 *
 * @author JUAN DIEGO
 */
public class ClienteDaoJDBC {

    private static final String SQL_SELECT = "SELECT * FROM cliente;";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM cliente WHERE id_cliente = ?;";
    private static final String SQL_INSERT = "INSERT INTO cliente (nombre, apellido, email, telefono, saldo) VALUES(?,?,?,?,?);";
    private static final String SQL_UPDATE = "UPDATE cliente SET nombre=?,apellido=?,email=?,telefono=?, saldo=? WHERE id_cliente=?;";
    private static final String SQL_DELETE = "DELETE FROM cliente WHERE id_cliente = ?;";

    public List<Cliente> listar() {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Cliente c1 = null;

        List<Cliente> clientes = new ArrayList<>();
        try {
            con = Conexion.getConnection();
            stmt = con.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idCliente = rs.getInt("id_cliente");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                double saldo = rs.getDouble("saldo");

                c1 = new Cliente(idCliente, nombre, apellido, email, telefono, saldo);
                clientes.add(c1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(con);
        }
        return clientes;
    }

    public Cliente encontrar(Cliente c1) {
        System.out.println("JDBC-L:56 " + c1);
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            con = Conexion.getConnection();
            stmt = con.prepareStatement(SQL_SELECT_BY_ID);
            stmt.setInt(1, c1.getIdCliente());
            rs = stmt.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                double saldo = rs.getDouble("saldo");
                c1.setNombre(nombre);
                c1.setApellido(apellido);
                c1.setEmail(email);
                c1.setTelefono(telefono);
                c1.setSaldo(saldo);
                System.out.println("JDBC-L:77 " + c1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(con);
        }
        return c1;
    }

    public int insertar(Cliente c1) {
        Connection con = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            con = Conexion.getConnection();
            stmt = con.prepareStatement(SQL_INSERT);
            stmt.setString(1, c1.getNombre());
            stmt.setString(2, c1.getApellido());
            stmt.setString(3, c1.getEmail());
            stmt.setString(4, c1.getTelefono());
            stmt.setDouble(5, c1.getSaldo());

            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(con);
        }
        return rows;
    }

    public int actualizar(Cliente c1) {
        Connection con = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            con = Conexion.getConnection();
            stmt = con.prepareStatement(SQL_UPDATE);
            stmt.setString(1, c1.getNombre());
            stmt.setString(2, c1.getApellido());
            stmt.setString(3, c1.getEmail());
            stmt.setString(4, c1.getTelefono());
            stmt.setDouble(5, c1.getSaldo());
            stmt.setInt(6, c1.getIdCliente());

            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(con);
        }
        return rows;
    }

    public int eliminar(Cliente c1) {
        Connection con = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            con = Conexion.getConnection();
            stmt = con.prepareStatement(SQL_DELETE);
            stmt.setInt(1, c1.getIdCliente());
            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(con);
        }
        return rows;
    }

}
