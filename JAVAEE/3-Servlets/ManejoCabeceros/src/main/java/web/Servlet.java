/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author ASUS
 */
@WebServlet("/ServletHeader")
public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws IOException {
        rs.setContentType("text/html;charset=UTF-8");
        PrintWriter out = rs.getWriter();

        String metodo = rq.getMethod();
        String uri = rq.getRequestURI();
        Enumeration cabeceros = rq.getHeaderNames();

        out.print("<html>");
        out.print("<head>");
        out.print("<title>Headers HTTP</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Headers HTTP</h1>");
        out.print("<br>");
        out.print("Metodo HTTP: " + metodo);
        out.print("<br>");
        out.print("URI : " + uri);
        out.print("<br>");

        while (cabeceros.hasMoreElements()) {
            String name = cabeceros.nextElement().toString();
            out.print("<b>" + name + ": </b>");
            out.print(rq.getHeader(name));
            out.print("<br>");
        }

        out.print("</body>");
        out.print("</html>");

    }

}
