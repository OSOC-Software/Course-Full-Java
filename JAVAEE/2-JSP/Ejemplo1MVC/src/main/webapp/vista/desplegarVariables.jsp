<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Despliegue de variables</title>
    </head>
    <body>
        <h1>Despliegue de variables</h1>
        <br>
        Variable de alcance Request: ${mensaje}
        <br>
        Variable de alcance de Session: 
        <br>
        Rectangulo: ${rectangulo}
        <br>
        Base: ${rectangulo.base}
        <br>
        Altura: ${rectangulo.altura}
        <br>
        Area: ${rectangulo.area}
        <br>
        <a href="${pageContext.request.contextPath}/index.jsp">Ir al inicio</a>
    </body>
</html>
