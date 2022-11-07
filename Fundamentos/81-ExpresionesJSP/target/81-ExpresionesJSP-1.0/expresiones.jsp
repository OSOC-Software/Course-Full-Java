<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Expresiones</title>
    </head>
    <body>
        <h1>JSP Expresiones</h1>
        Concatenacion: <%= "Saludos " + "JSP"%> 
        <br/>
        Operacion Matematica: <%= 2 * 3 / 2%>
        <br/>
        Session Id: <%= session.getId()%>      
        <br/>
        <a href="index.html" > Regresar al Inicio </a>
    </body>
</html>
