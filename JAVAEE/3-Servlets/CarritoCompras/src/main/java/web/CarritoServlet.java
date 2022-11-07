/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author ASUS
 */
@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws IOException {
        rs.setContentType("text/html;charset=UTF-8");
        HttpSession sesion = rq.getSession();
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");
        if (articulos == null) {
            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }
        String artNuevo = rq.getParameter("articulo");
        if (artNuevo != null && !artNuevo.trim().equals("")) {
            articulos.add(artNuevo);
        }
        try (PrintWriter out = rs.getWriter()) {
            out.println("<h1> Lista de Articulos </h1>");
            for (String art : articulos) {
                out.println("<li> " + art + "</li>");
            }
            out.println("<a href='/CarritoCompras'> Volver al inicio </a>");
        }
    }
}
