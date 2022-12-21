<!DOCTYPE html>
<html>
    <head>
        <title>Ejemplo MVC 2</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>

        <h1>Ejemplo MVC</h1>
        <br>
        <div style="color:red;">
            ${mensaje}
        </div>
        <a href="${pageContext.request.contextPath}/ServletController">Ir a ServletController sin params</a>
        <br>
        <a href="${pageContext.request.contextPath}/ServletController?accion=agregarVariables">Ir a ServletController para agregar variables</a>
        <br>
        <a href="${pageContext.request.contextPath}/ServletController?accion=listarVariables">Ir a ServletController para listar variables</a>
    </body>
</html>
