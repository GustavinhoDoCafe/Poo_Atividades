<%-- 
    Document   : index
    Created on : 15 de set. de 2023, 22:40:32
    Author     : Sanches
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Aula 05</title>
    </head>
    <body>
        <h1>AULA 05</h1>
        <h3>Calendario</h3>
   
         <form action="calendario.jsp" method="get">
             
         <h4>Ano</h4>
         <input type="text" name="ano" required><br>
         
         <h4>Mês</h4>
         <input type="text" name="mes" required><br>
         
        <input type="submit" value="Calendario">
        
        
    </form>
    </body>
</html>
