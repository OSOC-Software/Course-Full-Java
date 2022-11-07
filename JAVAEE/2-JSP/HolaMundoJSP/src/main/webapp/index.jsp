<%-- 

<%@ ->directiva

--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP HolaMundo</title>
    </head>
    <body>
        <h1>Hello World! JSP</h1>
        <ul>
            <li>
                Directiva "< % @ Parametros % >": Llamado de librerias, definicion de parametros 
            </li>
            <li> 
                Scriplet "< % Codigo JAVA % >": Similar a out.print(); se puede escribir codigodentro, y se pueden tener 
                ciertas variables disponibles. <% out.print("Hola desde scriplet < % % >");%> 
            </li>
            <li>
                Expresion Language "$ { expresion a imprimir }": Imprimir informacion al usuario: 
                ${"Hola mundo desde Expresion Language"}
            </li>
            <li>
                Expresion "< % = Imprimir variable % > " : Imprime variables con el objeto out.print 
                <%= "Hola mundo con Expresiones"%>
            </li>
            <li>
                Libreria de JSTL "< [prefix definido arriba en la directiva]: funcion a llamar de la libreria ejemplo < c : out value="" / >".
                <c:out value="HolaMundo con JSTL" />
            </li>
        </ul>
    </body>
</html>
