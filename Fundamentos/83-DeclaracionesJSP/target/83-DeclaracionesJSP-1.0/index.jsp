<%-- Se agrega declaracion JSP --%>
<%!
    //Variable con metodo get
    private String usuario = "Alberto";

    public String getUsuario() {
        return this.usuario;
    }

    //Contador de visitas
    private int contadorVisitas = 1;
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uso de declaraciones con JSP</title>
    </head>
    <body>
        <h1>Uso de declaraciones con JSP</h1>
        Valor de usuario por medio del atributo: <%= this.usuario%>
        <br/>
        Valor usuario por medio del metodo: <%= this.getUsuario()%>
        <br/>
        Valor Contador visitas: <%= this.contadorVisitas++ %>
    </body>
</html>
