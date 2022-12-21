/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

/**
 *
 * @author JUAN DIEGO
 */
@WebServlet("/ServletController")
public class ServletController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {

        String accion = rq.getParameter("accion");

        Rectangulo recRequest = new Rectangulo(1, 2);
        Rectangulo recSession = new Rectangulo(3, 4);
        Rectangulo recApp = new Rectangulo(5, 6);

        if ("agregarVariables".equals(accion)) {
            rq.setAttribute("rectanguloRequest", recRequest);
            HttpSession session = rq.getSession();
            session.setAttribute("rectanguloSession", recSession);
            ServletContext app = this.getServletContext();
            app.setAttribute("rectanguloApp", recApp);
            rq.setAttribute("mensaje", "Las variables fueron agregadas");
            rq.getRequestDispatcher("index.jsp").forward(rq, rs);

        } else if ("listarVariables".equals(accion)) {
            rq.getRequestDispatcher("WEB-INF/alcanceVariables.jsp").forward(rq, rs);
        } else {
            rq.setAttribute("mensaje", "Accion no proporcionada o desconocida");
            rq.getRequestDispatcher("index.jsp").forward(rq, rs);
        }
    }
}
