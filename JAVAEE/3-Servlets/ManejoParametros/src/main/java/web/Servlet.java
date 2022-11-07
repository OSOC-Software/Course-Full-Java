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
        String usuario = rq.getParameter("usuario");
        String pass = rq.getParameter("pass");

        System.out.println("usuario = " + usuario);
        System.out.println("pass = " + pass);

        PrintWriter out = rs.getWriter();
        out.print("<html>");
        out.print("<body>");

        out.println("El parametro de usuario es: " + usuario);
        out.print("<br>");
        out.println("El parametro de password es: " + pass);

        out.print("</body>");
        out.print("</html>");

    }

}
