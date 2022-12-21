<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alcance de Variables</title>
    </head>
    <body>
        <h1>Alcance de variables!</h1>
        <br>
        Variable Request:
        Base: ${rectanguloRequest.base},
        Altura: ${rectanguloRequest.altura},
        Area: ${rectanguloRequest.area}
        <br>
        Variable Session
        Base: ${rectanguloSession.base},
        Altura: ${rectanguloSession.altura},
        Area: ${rectanguloSession.area}
        <br>
        Variable App
        Base: ${rectanguloApp.base},
        Altura: ${rectanguloApp.altura},
        Area: ${rectanguloApp.area}
        <br>
        <a href="index.jsp">Ir al inicio</a>
    </body>
</html>
