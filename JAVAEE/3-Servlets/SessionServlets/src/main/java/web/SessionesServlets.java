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
@WebServlet("/SessionesServlets")
public class SessionesServlets extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws IOException {
        rs.setContentType("text/html;charset=UTF-8");
        HttpSession sesion = rq.getSession();
        String titulo = null;
        Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas");
        if (contadorVisitas == null) {
            contadorVisitas = 1;
            titulo = "Bienvenido por primera vez";
        } else {
            contadorVisitas++;
            titulo = "Bienvenido nuevamente";
        }
        sesion.setAttribute("contadorVisitas", contadorVisitas);
        PrintWriter out = rs.getWriter();
        out.print("<h1>" + titulo + "</h1>");
        out.print("<br>");
        out.print("Numero de Accesos: " + contadorVisitas);
        out.print("<br>");
        out.print("Session: " + sesion.getId());
        out.print("<br>");
        out.close();
    }
}
