/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
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

        Rectangulo rectangulo = new Rectangulo(3, 6);
        rq.setAttribute("mensaje", "Saludos desde Servlet Controller");

        HttpSession session = rq.getSession();
        session.setAttribute("rectangulo", rectangulo);

        RequestDispatcher rqd= rq.getRequestDispatcher("vista/desplegarVariables.jsp");
        
        rqd.forward(rq, rs);
        
    }
}
