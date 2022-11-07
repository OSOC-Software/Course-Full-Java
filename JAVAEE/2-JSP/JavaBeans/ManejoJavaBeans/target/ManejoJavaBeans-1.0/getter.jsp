<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Lee valores del JavaBean</title>
    </head>
    <body>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session"/>
        <br>
        Valor base: <jsp:getProperty name="rectangulo" property="base" />
        <br>
        Valor altura: <jsp:getProperty name="rectangulo" property="altura" />
        <br>
        <a href="index.jsp">Ir al inicio</a>
    </body>
</html>
