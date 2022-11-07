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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        String articuloNuevo = request.getParameter("articulo");
        HttpSession session = request.getSession();
        List<String> articulos = (List<String>) session.getAttribute("articulos");
        if (articulos == null) {
            articulos = new ArrayList<>();
            session.setAttribute("articulos", articulos);
        }
        if (articuloNuevo != null && !articuloNuevo.trim().equals("")) {
            articulos.add(articuloNuevo);
        }

        PrintWriter out = response.getWriter();
        out.print("<h2>Lista de Articulos</h2>");
        out.print("<br/>");
        for (String art : articulos) {
            out.print("<li>" + art + "</li>");
        }
        out.print("<br/>");
        out.print("<a href='/79-CarritoCompras'>Ir a inicio </a>");
        out.close();
    }

}
