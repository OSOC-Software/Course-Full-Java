<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Scriptlest</title>
    </head>
    <body>
        <h1>JSP con Scriptlest</h1>
        <br/>
        <%-- Scriptlest para enviar info al navegador --%>
        <%
            out.print("Saludos desde un Scriptlest");
            out.print("<br/>");
        %>
        <%-- Scriptlest para manipular los objetos implicitos --%>
        <%            String nombreApp = request.getContextPath();
            out.print("Nombre de la App: " + nombreApp);
            out.print("<br/>");
        %>
        <%-- Scriptlest pacon codigo condicionado --%>
        <%
            if (session != null && session.isNew()) {
        %>
        <h3>La sesion SI es nueva</h3>
        <%
        } else if (session != null) {
        %>
        <h3>La sesion NO es nueva</h3>
        <%
            }
        %>
        <br/>
        <a href="index.html" > Regresar al inicio </a>
    </body>
</html>
