/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import datos.ClienteDaoJDBC;
import dominio.Cliente;
import java.io.IOException;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author JUAN DIEGO
 */
@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        String accion = rq.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "editar":
                    this.editarCliente(rq, rs);
                    break;
                case "eliminar":
                    this.eliminarCliente(rq, rs);
                    break;
                default:
                    this.accionDefault(rq, rs);
            }
        } else {
            this.accionDefault(rq, rs);
        }
    }

    private void editarCliente(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        int idCliente = Integer.parseInt(rq.getParameter("idCliente"));
        Cliente cliente = new ClienteDaoJDBC().encontrar(new Cliente(idCliente));
        System.out.println("ServletC - L:41" + cliente + "; " + idCliente);
        rq.setAttribute("cliente", cliente);
        String jspEditar = "/WEB-INF/paginas/cliente/editarCliente.jsp";
        rq.getRequestDispatcher(jspEditar).forward(rq, rs);
    }

    private void accionDefault(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        List<Cliente> clientes = new ClienteDaoJDBC().listar();
        System.out.println("clientes: " + clientes);
        HttpSession session = rq.getSession();
        session.setAttribute("clientes", clientes);
        session.setAttribute("totalClientes", clientes.size());
        session.setAttribute("saldoTotal", calcularsaldoTotal(clientes));
        rs.sendRedirect("clientes.jsp");
        //rq.getRequestDispatcher("clientes.jsp").forward(rq, rs);
    }

    @Override
    protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        String accion = rq.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "insertar":
                    this.insertarCliente(rq, rs);
                    break;
                case "modificar":
                    this.modificarCliente(rq, rs);
                    break;
                default:
                    this.accionDefault(rq, rs);
            }
        } else {
            this.accionDefault(rq, rs);
        }
    }

    private void insertarCliente(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        String nombre = rq.getParameter("nombre");
        String apellido = rq.getParameter("apellido");
        String telefono = rq.getParameter("telefono");
        String email = rq.getParameter("email");
        double saldo = 0;
        String saldoString = rq.getParameter("saldo");
        if (saldoString != null && !"".equals(saldoString)) {
            saldo = Double.parseDouble(saldoString);
        }
        Cliente cliente = new Cliente(nombre, apellido, email, telefono, saldo);
        int registrosModificados = new ClienteDaoJDBC().insertar(cliente);
        System.out.println("registrosModificados: " + registrosModificados);
        this.accionDefault(rq, rs);
    }

    private void modificarCliente(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        int idCliente = Integer.parseInt(rq.getParameter("idCliente"));
        String nombre = rq.getParameter("nombre");
        String apellido = rq.getParameter("apellido");
        String telefono = rq.getParameter("telefono");
        String email = rq.getParameter("email");
        double saldo = 0;
        String saldoString = rq.getParameter("saldo");
        if (saldoString != null && !"".equals(saldoString)) {
            saldo = Double.parseDouble(saldoString);
        }
        Cliente cliente = new Cliente(idCliente, nombre, apellido, email, telefono, saldo);
        int registrosModificados = new ClienteDaoJDBC().actualizar(cliente);
        System.out.println("registrosModificados: " + registrosModificados);
        this.accionDefault(rq, rs);
    }

    private void eliminarCliente(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        int idCliente = Integer.parseInt(rq.getParameter("idCliente"));
        Cliente cliente = new Cliente(idCliente);
        int registrosModificados = new ClienteDaoJDBC().eliminar(cliente);
        System.out.println("registrosModificados: " + registrosModificados);
        this.accionDefault(rq, rs);
    }

    private double calcularsaldoTotal(List<Cliente> clientes) {
        double saldoTotal = 0;

        for (Cliente cliente : clientes) {
            saldoTotal += cliente.getSaldo();
        }
        return saldoTotal;
    }
}
