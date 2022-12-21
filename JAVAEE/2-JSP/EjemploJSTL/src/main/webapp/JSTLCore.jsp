<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Page</title>
    </head>
    <body>
        <h1>JSTL Core (JSP Standard tag Library) !</h1>
        <br>
        <c:set var="nombre" value="Juan Diego" />
        Variable nombre: <c:out value="${nombre}" />
        <br>
        Variable con codigo HTML: 
        <c:out value="<h4> Hola desde html </h4>" escapeXml="false"/>
        <br>
        Uso de IF: <c:set var="bandera" value="true" />
        <br>
        <c:if test="${bandera}">
            Bandera es verdadera
        </c:if>
        <br>
        <c:if test="${param.opcion != null}">
            <c:choose>
                <c:when test="${param.opcion == 1}">
                    <br>
                    Opcion 1 seleccionada por parametro
                </c:when>
                <c:when test="${param.opcion == 2}">
                    <br>
                    Opcion 2 seleccionada por parametro
                </c:when>
                <c:otherwise>
                    <br>
                    Opcion de url desconocida: ${param.opcion}
                </c:otherwise>
            </c:choose>
        </c:if>
        <br>
        <%
            String nombres[] = {"Cosme", "Timmy", "Juan"};
            request.setAttribute("nombres", nombres);
        %>
        Lista de nombres: <br>
        <ul>
            <c:forEach var="per" items="${nombres}">
                <li>
                    ${per}
                </li>
            </c:forEach>
        </ul>
        <br>
        <a href="index.jsp">Ir al inicio</a>
    </body>
</html>
