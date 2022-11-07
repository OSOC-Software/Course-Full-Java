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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //Codigo duro
        String usuarioOk = "Juan";
        String passOk = "123";

        String usuario = request.getParameter("usuario");
        String pass = request.getParameter("password");
        PrintWriter out = response.getWriter();
        if (usuarioOk.equals(usuario) && passOk.equals(pass)) {
            out.print("<h1>");
            out.print("Datos Correctos");
            out.print("</h1>");
        } else {
            response.sendError(response.SC_UNAUTHORIZED, "Credenciales incorrectas");
        }
        out.print("<h1>");
        out.print("UsuarioOK: " + usuarioOk + ", Usuario: " + usuario + ". PassOk: " + passOk + ", pass: " + pass);
        out.print("</h1>");

        out.close();
    }
}
