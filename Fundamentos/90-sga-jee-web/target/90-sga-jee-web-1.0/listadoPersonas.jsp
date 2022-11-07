<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page trimDirectiveWhitespaces="true" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html> 
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de personas</title>
    </head>
    <body>
        <ul>
            <c:forEach items="${personas}" var="persona">
                <li>
                    ${persona.nombre} ${persona.apellido}
                </li>
            </c:forEach>
        </ul>
    </body>
</html>
