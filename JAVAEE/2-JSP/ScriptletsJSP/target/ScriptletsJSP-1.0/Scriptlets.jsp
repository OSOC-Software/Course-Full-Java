<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Scriptlets</title>
    </head>
    <body>
        <h1>Scriptlets</h1>
        <br>
        <%-- Info para el navegador --%>
        <%
            out.print("Saludos desde un Scriptlet");
        %>
        <br>
        <%-- Info para el navegador --%>
        <%
            String nombreApp = request.getContextPath();
            out.print("Name App: " + nombreApp);
        %>
        <br>
        <%-- Codigo condicionado --%>
        <%
            if (session != null && session.isNew()) {
        %>
        Nueva sesion<br>
        <%
        } else if (session != null) {
        %>
        Sesion antigua<br>
        <%}%>
        <br>
        <a href="index.html">Inicio</a>
    </body>
</html>
