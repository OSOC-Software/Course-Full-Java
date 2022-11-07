package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletHeaders")
public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String metodoHttp = request.getMethod();
        out.print("<html>");
        out.print("<head>");
        out.print("<title> Headers Http</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1> Headers HTTP </h1>");
        out.print("Metodo Http:" + metodoHttp);
        String uri = request.getRequestURI();
        out.print("<br/>");
        out.print("URI solicitada:" + uri);
        out.print("<br/>");

        //Todos los cabeceros
        Enumeration cabeceros = request.getHeaderNames();
        while (cabeceros.hasMoreElements()) {
            String nombreCab = (String) cabeceros.nextElement();
            out.print("<b>" + nombreCab + ": </b>");
            out.print(request.getHeader(nombreCab));
            out.print("<br/>");
        }

        out.print("</body>");
        out.print("</html>");
        out.close();
    }
}
