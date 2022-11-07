<%-- 
    Document   : newjspPRocesaFormulario
    Created on : 21 sept. 2022, 22:49:31
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Formulario</title>
    </head>
    <body>
        <h1>Resultado Formulario</h1>
        <br>
        Usuario: <%= request.getParameter("usuario")%>
        <br>
        Password: <%= request.getParameter("password")%>
        <br>
        <a href="index.html">Volver al inicio</a>
    </body>
</html>
