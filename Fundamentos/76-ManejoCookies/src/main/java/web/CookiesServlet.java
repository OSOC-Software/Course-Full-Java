/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author ASUS
 */
@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //Primer visita
        boolean nuevo = true;
        //Get Todas las Cookies
        Cookie[] cookies = request.getCookies();
        //Buscar si existe cookie
        //Visitante recurrente 
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")) {
                    nuevo = false;
                    break;
                }
            }
        }
        String mensaje = "";
        if (nuevo) {
            Cookie visitante = new Cookie("visitanteRecurrente", "si");
            response.addCookie(visitante);
            mensaje = "Gracias por tu primer visita";
        } else {
            mensaje = "Gracias por visitarnos de nuevo";
        }
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("Mensaje: " + mensaje);
        out.close();
    }

}
