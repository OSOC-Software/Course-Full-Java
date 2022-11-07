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
@WebServlet("/CookieServlet")
public class ManagementCookies extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws IOException {
        boolean newUser = true;
        Cookie[] cookies = rq.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("vistanteRecurrente") && c.getValue().equals("si")) {
                    newUser = false;
                    break;
                }
            }
        }
        String mensaje = "";
        if (newUser) {
            Cookie visitanteCookie = new Cookie("vistanteRecurrente", "si");
            rs.addCookie(visitanteCookie);
            mensaje = "Gracias por Visitar nuestro sitio por primera vez";
        } else {
            mensaje = "Gracias por visitar nuevamente nuestro sitio";
            rs.setContentType("text/html;charset=UTF-8");
            PrintWriter out = rs.getWriter();
            out.println("Mensaje: " + mensaje);
            out.close();
        }
    }
}
