/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author ASUS
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws IOException {
        String usuarioOK = "Juan";
        String passwordOK = "123";
        String usuario = rq.getParameter("usuario");
        String password = rq.getParameter("password");

        PrintWriter out = rs.getWriter();

        if (usuarioOK.equals(usuario) && passwordOK.equals(password)) {
            out.print("<h1> Datos Correctos");
            out.print("<br>Usuario: " + usuario);
            out.print("<br>Password: " + password);
            out.print("</h1>");
        } else {
            rs.sendError(rs.SC_UNAUTHORIZED, "Credenciales incorrectas");
        }
        out.close();
    }
}
