/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/HolaMundo")
public class HolaMundo extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws IOException{
        rs.setContentType("text/html;charset=UTF-8");
        PrintWriter out = rs.getWriter();
        out.println("Hola mundo desde Servlets");
    }
}
