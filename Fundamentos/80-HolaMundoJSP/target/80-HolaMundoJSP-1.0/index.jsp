<%-- 
    Document   : index
    Created on : 24 ene. 2022, 21:48:23
    Author     : ASUS
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Hola Mundo JSP</title>
    </head>
    <body>
        <h1>Hola Mundo JSP</h1>
        <ul>
            <li> <% out.print("Hola mundo con Scriplets");%> </li>
            <li> ${ "Hola mundo con Expression Lenguage (EL)" } </li>
            <li> <%= "Hola mundo con Expresiones!" %> </li>
            <li> <c:out value="Hola mundo desde JSTL" /> </li>
        </ul>
    </body>
</html>
