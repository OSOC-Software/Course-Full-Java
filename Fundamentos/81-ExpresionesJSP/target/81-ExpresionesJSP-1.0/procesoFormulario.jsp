<%-- 
    Document   : procesoFormulario
    Created on : 25 ene. 2022, 22:33:45
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Proceso Formulario</title>
    </head>
    <body>
        <h1> Resultado de Procesar el Formulario </h1>
        Usuaro: <%= request.getParameter("usuario")%>
        <br/>
        Password: <%= request.getParameter("password")%>
        <br/>
        <a href="index.html" >Regresar al inicio</a>
    </body>
</html>
