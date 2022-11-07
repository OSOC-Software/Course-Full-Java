<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo Inclusion Estatica</title>
    </head>
    <body>
        <h1>Ejemplo Inclusion Estatica!</h1>
        <br>
        <ul>
            <li>
                <%@include  file="./pages/noticias1.html" %>
            </li>
            <li>
                <%@include  file="./pages/noticias2.jsp" %>
            </li>
        </ul>
    </body>
</html>
