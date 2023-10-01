<%-- 
    Document   : index
    Created on : 25 de set. de 2023, 15:24:34
    Author     : Fatec
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
        <%@include file="WEB-INF/jspf/html-head-libs.jspf" %>
    </head>
    <body>
        <%@include file="WEB-INF/jspf/navbar.jspf" %>
        <%if(userName!=null){%>
        <div class="m-2">
        <h2>Pagina Inícial</h2>  
        <div> Conteudo da Página</div>
        </div>
<%}%>
        <%@include file="WEB-INF/jspf/html-body-libs.jspf" %>
    </body>
</html>
