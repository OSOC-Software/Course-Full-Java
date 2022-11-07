<%-- 
    Document   : Expresiones
    Created on : 21 sept. 2022, 22:49:06
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Expresiones</title>
    </head>
    <body>
        <h1>JSP Expresiones</h1>
        <br>
        Concatenacion: <%= "Saludos " + "JSP"%>
        <br>
        Operacion Matematica: <%= 2 * 3 / 6%>
        <br>
        Session ID: <%= session.getId()%>
        <br>
        <a href="index.html">Volver al inicio</a>
    </body>
</html>
