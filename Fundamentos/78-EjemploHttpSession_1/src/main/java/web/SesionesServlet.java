package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
@WebServlet("/SesionesServlet")
public class SesionesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        String titulo = null;
        Integer contadorVisitas = (Integer) session.getAttribute("contadorVisitas");
        if (contadorVisitas == null) {
            contadorVisitas = 1;
            titulo = "Bienvenido por primera vez";
        } else {
            contadorVisitas++;
            titulo = "Bienvenido nuevamente";
        }
        session.setAttribute("contadorVisitas", contadorVisitas);
        PrintWriter out = response.getWriter();
        out.print(titulo);
        out.print("<br/>");
        out.print("Numero de accesos al recurso: " + contadorVisitas);
        out.print("<br/>");
        out.print("ID Session: " + session.getId());
        out.close();
    }

}
