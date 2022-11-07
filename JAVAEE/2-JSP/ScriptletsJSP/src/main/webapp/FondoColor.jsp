<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String fondo = request.getParameter("color");
    if (fondo == null && fondo.trim().equals("")) {
        fondo = "white";
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fondo Color JSP</title>
    </head>
    <body bgcolor="<%=fondo%>">
        <h1>Cambio de color</h1>
        <br> 
        Color de fondo = <%=fondo%>
        <br>
        <a href="index.html">Inicio</a>
    </body>
</html>
