/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ASUS
 */
@WebServlet("/HoraServlet")
public class HpraServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.setHeader("refresh", "1");
        Date fecha = new Date();
        SimpleDateFormat format_ = new SimpleDateFormat("'Hora actualizada' HH:mm:ss");
        String horaFormato = format_.format(fecha);
        PrintWriter out = resp.getWriter();
        out.print("Hora actualizada: " + horaFormato);
        out.close();
    }
}
