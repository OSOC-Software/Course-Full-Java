<%-- 
   Declaracion, atributo o metodo que hara parte del JSP generado
--%>

<%! 
    //Variable con get ()
    private String usuario = "Juan Diego";
    public String getUsuario(){
        return this.usuario;
    }
    private int contadorVisitas = 1;
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Declaraciones con JSP</title>
    </head>
    <body>
        <h1>Declaraciones</h1>
        <br>
        Valor del usuario por variable: <%= this.usuario %>
        <br>
        Valor del usuario por metodo: <%= this.getUsuario() %>
        <br>
        Valor del contador por variable: <%= this.contadorVisitas++ %>
    </body>
</html>
