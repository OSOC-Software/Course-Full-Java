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
@WebServlet("/GeneracionExcelServlet")
public class GeneracionExcelServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws IOException {
        rs.setContentType("application/vnd.ms-excel");
        rs.setHeader("Content-Disposition", "attachment;filename=Ejemplo.xls");
        //Libreria de uso profesional para excel poi.apache.org 
        rs.setHeader("Pragma", "no-cache");
        rs.setHeader("Cache-Control", "no-store");
        rs.setDateHeader("Expires", -1);

        PrintWriter out = rs.getWriter();
        out.println("\tValores");
        out.println("\t1");
        out.println("\t2");
        out.println("Total\t=SUMA(B2:B3)");
        out.close();
    }

}
