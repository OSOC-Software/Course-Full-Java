<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo EL</title>
    </head>
    <body>
        <h1>E.L. y Variables Implicitas</h1>
        <br>
        <ul>
            <li>Nombre App: ${pageContext.request.contextPath}</li>         
            <li>Nombre Navegador: ${header['User-Agent']}</li>
            <li>ID Session: ${cookie.JSESSIONID.value}</li>
            <li>Web servlet: ${pageContext.servletContext.serverInfo}</li>       
            <li>Nombre del parametro: ${param.usuarios} - ${param['usuarios']}</li>
        </ul>
        <br>
        <a href="index.jsp">Ir a inicio</a>
    </body>
</html>
