/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.*;

/**
 *
 * @author ASUS
 */
public class TestMySQLJDBC {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublic KeyRetrieval=true";
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, "root", "admin");
            Statement instruccion = con.createStatement();
            var sql = "SELECT * FROM persona;";
            ResultSet resultado = instruccion.executeQuery(sql);
            while (resultado.next()) {
                System.out.println("--------------------------------------------");
                System.out.println("Id: " + resultado.getInt("id_persona"));
                System.out.println("Nombre: " + resultado.getString("nombre"));
                System.out.println("Apellido: " + resultado.getString("apellido"));
                System.out.println("Email: " + resultado.getString("email"));
                System.out.println("Telefono: " + resultado.getString("telefono"));
            }
            con.close();
            instruccion.close();
            resultado.close();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
